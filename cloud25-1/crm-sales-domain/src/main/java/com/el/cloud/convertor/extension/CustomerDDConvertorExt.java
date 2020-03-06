package com.el.cloud.convertor.extension;


import com.el.cloud.common.AppConstants;
import com.el.cloud.common.BizCode;
import com.el.cloud.convertor.CustomerConvertor;
import com.el.cloud.convertor.extensionpoint.CustomerConvertorExtPt;
import com.el.cloud.dto.clientobject.CustomerCO;
import com.el.cloud.entity.CustomerE;
import com.el.cloud.tunnel.dataobject.CustomerDO;
import com.el.cloud.valueobject.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.annotation.extension.Extension;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Extension(bizCode = BizCode.DD)
public class CustomerDDConvertorExt implements CustomerConvertorExtPt {

    @Autowired
    private CustomerConvertor customerConvertor;//Composite basic convertor to do basic conversion

    @Override
    public CustomerE clientToEntity(CustomerCO customerCO) {
        CustomerE customerEntity = customerConvertor.clientToEntity(customerCO);
        //In this business, AD and RFQ are regarded as different source
        if(AppConstants.SOURCE_AD.equals(customerCO.getSource()))
        {
            customerEntity.setSourceType(SourceType.AD);
        }
        if (AppConstants.SOURCE_RFQ.equals(customerCO.getSource())){
            customerEntity.setSourceType(SourceType.RFQ);
        }
        return customerEntity;
    }

    public CustomerCO dataToClient(CustomerDO customerDO){
        return customerConvertor.dataToClient(customerDO);
    }
}
