package com.el.cloud.dto;

import com.el.cloud.dto.clientobject.CustomerCO;
import lombok.Data;
import org.xujin.halo.dto.Command;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Data
public class CustomerAddCmd extends Command{

    private CustomerCO customer;
    
}
