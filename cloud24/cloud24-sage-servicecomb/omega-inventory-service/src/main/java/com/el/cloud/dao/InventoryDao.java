package com.el.cloud.dao;

import com.el.cloud.domain.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public interface InventoryDao extends JpaRepository<Inventory, Integer> {
    Inventory findByProductCode(String productCode);
}
