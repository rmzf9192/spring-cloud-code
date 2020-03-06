package com.el.cloud.dao;

import com.el.cloud.domain.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public interface OrderDao extends JpaRepository<UserOrder, Integer> {
    UserOrder findByTxId(String txId);
}
