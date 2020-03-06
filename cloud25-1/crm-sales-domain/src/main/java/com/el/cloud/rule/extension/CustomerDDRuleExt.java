package com.el.cloud.rule.extension;

import cn.springcloud.book.crm.sales.common.BizCode;
import cn.springcloud.book.crm.sales.domain.customer.entity.CustomerE;
import cn.springcloud.book.crm.sales.domain.customer.rule.extensionpoint.CustomerRuleExtPt;
import cn.springcloud.book.crm.sales.domain.customer.valueobject.SourceType;
import org.xujin.halo.annotation.extension.Extension;
import org.xujin.halo.exception.BizException;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Extension(bizCode = BizCode.DD)
public class CustomerDDRuleExt implements CustomerRuleExtPt {

    @Override
    public boolean addCustomerCheck(CustomerE customerEntity) {
        if(SourceType.AD == customerEntity.getSourceType()){
            throw new BizException("Sorry, Customer from advertisement can not be added in this period");
        }
        return true;
    }
}
