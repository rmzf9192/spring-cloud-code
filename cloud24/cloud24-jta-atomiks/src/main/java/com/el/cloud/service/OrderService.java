package com.el.cloud.service;

import com.el.cloud.dao.log.EventLogDao;
import com.el.cloud.dao.order.UserOrderDao;
import com.el.cloud.domain.log.EventLog;
import com.el.cloud.domain.order.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Component
public class OrderService {

    @Autowired
    UserOrderDao userOrderDao;

    @Autowired
    EventLogDao eventLogDao;

    @Transactional
    public void newOrder(String userId, String productCode, int quantity){
        UserOrder userOrder = new UserOrder();
        userOrder.setUserId(userId);
        userOrder.setProductCode(productCode);
        userOrder.setQuantity(quantity);
        userOrderDao.save(userOrder);

        EventLog eventLog = new EventLog();
        eventLog.setOperation("new order");
        eventLog.setOperator(userId);
        eventLogDao.save(eventLog);
    }

    @Transactional
    public void newOrderRollback(String userId, String productCode, int quantity){
        UserOrder userOrder = new UserOrder();
        userOrder.setUserId(userId);
        userOrder.setProductCode(productCode);
        userOrder.setQuantity(quantity);
        userOrderDao.save(userOrder);

        EventLog eventLog = new EventLog();
        eventLog.setOperation("new order");
        eventLog.setOperator(userId);
        eventLogDao.save(eventLog);

        throw new RuntimeException("test jta rollback");
    }
}
