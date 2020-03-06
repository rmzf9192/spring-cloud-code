package com.el.cloud.dto.clientobject;

import lombok.Data;
import org.xujin.halo.dto.ClientObject;

import javax.validation.constraints.NotEmpty;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Data
public class CustomerCO extends ClientObject {
    private String customerId;
    private String memberId;
    private String customerName;
    private CustomerType customerType;

    @NotEmpty
    private String companyName;
    @NotEmpty
    private String source;  //advertisement, p4p, RFQ, ATM


    
}
