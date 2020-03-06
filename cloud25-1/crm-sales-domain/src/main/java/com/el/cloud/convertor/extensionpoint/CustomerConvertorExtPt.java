package com.el.cloud.convertor.extensionpoint;

import com.el.cloud.dto.clientobject.CustomerCO;
import com.el.cloud.entity.CustomerE;
import org.xujin.halo.convertor.ConvertorI;
import org.xujin.halo.extension.ExtensionPointI;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public interface CustomerConvertorExtPt extends ConvertorI, ExtensionPointI {

    public CustomerE clientToEntity(CustomerCO customerCO);
}
