package com.el.cloud.controller;

import com.el.cloud.domain.Inventory;
import com.el.cloud.dto.OrderRequest;
import com.el.cloud.service.InventoryService;
import org.apache.servicecomb.saga.omega.context.OmegaContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    OmegaContext omegaContext;

    @Autowired
    InventoryService inventoryService;

    @PostMapping
    public Inventory submitOrderRequest(@RequestBody OrderRequest orderRequest){
        orderRequest.setTxId(omegaContext.globalTxId());
        return inventoryService.order(orderRequest);
    }
}
