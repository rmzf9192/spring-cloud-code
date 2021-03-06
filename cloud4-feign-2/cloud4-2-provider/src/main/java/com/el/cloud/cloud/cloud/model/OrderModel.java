package com.el.cloud.cloud.cloud.model;

import java.util.Date;

/**
 * @author roman zhangfei
 * @Date 2020/2/15
 * @Version V1.0
 */
public class OrderModel {
    private Long orderNo;
    private Date createTime;
    private Date payTime;

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}