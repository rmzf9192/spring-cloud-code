package com.el.cloud.dao.order;

import com.el.cloud.domain.order.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public interface UserOrderDao extends JpaRepository<UserOrder, Integer> {
}
