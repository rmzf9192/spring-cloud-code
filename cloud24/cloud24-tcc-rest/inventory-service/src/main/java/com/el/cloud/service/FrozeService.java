package com.el.cloud.service;

import com.el.cloud.dao.FrozeRequestDao;
import com.el.cloud.dao.InventoryDao;
import com.el.cloud.domain.FrozeRequest;
import com.el.cloud.domain.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Component
public class FrozeService {

    @Autowired
    InventoryDao inventoryDao;

    @Autowired
    FrozeRequestDao frozeRequestDao;

    @Transactional
    public void confirm(FrozeRequest request, Inventory inventory) {
        frozeRequestDao.delete(request);
        int left = inventory.getLeftNum() - request.getFrozenNum();
        if (left < 0) {
            throw new IllegalStateException("inventory left < 0");
        }
        inventory.setLeftNum(left);
        inventoryDao.save(inventory);
    }

    @Transactional
    public void cancel(FrozeRequest request) {
        frozeRequestDao.delete(request);
    }
}
