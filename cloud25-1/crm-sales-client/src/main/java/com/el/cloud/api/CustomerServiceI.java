package com.el.cloud.api;

import com.el.cloud.dto.CustomerAddCmd;
import com.el.cloud.dto.CustomerCheckConflictCmd;
import com.el.cloud.dto.CustomerFindByCriteriaQry;
import com.el.cloud.dto.clientobject.CustomerCO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.xujin.halo.dto.MultiResponse;
import org.xujin.halo.dto.Response;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@FeignClient("crm-sales-provider")
public interface CustomerServiceI {

    @GetMapping("/add")
    public Response addCustomer(CustomerAddCmd customerAddCmd);

    @GetMapping("/checkConflict")
    public MultiResponse<CustomerCO> checkConflict(CustomerCheckConflictCmd customerCheckConflictCmd);

    @GetMapping("/list")
    public MultiResponse<CustomerCO> findByCriteria(CustomerFindByCriteriaQry CustomerFindByCriteriaQry);

}