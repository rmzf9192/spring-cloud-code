package com.el.cloud.tunnel.dataobject;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.xujin.halo.repository.DataObject;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CustomerDO implements DataObject {
    private String customerId;
    private String memberId;
    private String globalId;
    private String companyName;
    private String source;
    private String companyType;
}
