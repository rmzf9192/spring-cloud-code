package com.el.cloud.service;

import com.el.cloud.dao.OrderDao;
import com.el.cloud.domain.UserOrder;
import org.apache.servicecomb.saga.omega.transaction.annotations.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Service
public class OrderService {

    private Set<String> executedSet = new ConcurrentHashMap<>().newKeySet();

    private Set<String> canceledSet = new ConcurrentHashMap<>().newKeySet();

    @Autowired
    OrderDao orderDao;

    @Compensable(timeout = 1, compensationMethod = "cancel")
    @Transactional
    public UserOrder order(UserOrder userOrder){
//        userOrder.getTxId().substring(0,100);
        if(executedSet.contains(userOrder.getTxId()) || canceledSet.contains(userOrder.getTxId())){
            return orderDao.findByTxId(userOrder.getTxId());
        }
        userOrder.setState(OrderState.CONFIRMED);
        userOrder.setExpireTime(LocalDateTime.now().plusMinutes(30));
        UserOrder result = orderDao.save(userOrder);
        executedSet.add(userOrder.getTxId());
        return result;
    }

    @Transactional
    public UserOrder cancel(UserOrder userOrder){
        if(canceledSet.contains(userOrder.getTxId()) || !executedSet.contains(userOrder.getTxId())){
            return orderDao.findByTxId(userOrder.getTxId());
        }
        UserOrder result = orderDao.findByTxId(userOrder.getTxId());
        if (result == null) {
            throw new IllegalStateException();
        }
        result.setState(OrderState.CANCELED);
        UserOrder saved = orderDao.save(result);
        canceledSet.add(userOrder.getTxId());
        return saved;
    }
}
