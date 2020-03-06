package com.el.cloud.service;


import com.el.cloud.api.CustomerServiceI;
import com.el.cloud.dto.CustomerAddCmd;
import com.el.cloud.dto.CustomerCheckConflictCmd;
import com.el.cloud.dto.CustomerFindByCriteriaQry;
import com.el.cloud.dto.clientobject.CustomerCO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.xujin.halo.command.CommandBusI;
import org.xujin.halo.dto.MultiResponse;
import org.xujin.halo.dto.Response;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@RestController
public class CustomerServiceImpl implements CustomerServiceI {

    @Autowired
    private CommandBusI commandBus;
    
    @Override
    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return (Response)commandBus.send(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerCO> checkConflict(CustomerCheckConflictCmd customerCheckConflictCmd) {
        return (MultiResponse<CustomerCO>)commandBus.send(customerCheckConflictCmd);
    }

    @Override
    public MultiResponse<CustomerCO> findByCriteria(CustomerFindByCriteriaQry CustomerFindByCriteriaQry) {
        return (MultiResponse<CustomerCO>)commandBus.send(CustomerFindByCriteriaQry);
    }

}
