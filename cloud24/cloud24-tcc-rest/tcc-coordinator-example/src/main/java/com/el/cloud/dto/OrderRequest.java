package com.el.cloud.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Data
@Builder
public class OrderRequest {

    private String userId;

    private String productCode;

    private Integer quantity;
}
