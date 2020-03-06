package com.el.cloud.command.query;


import com.el.cloud.convertor.CustomerConvertor;
import com.el.cloud.dto.CustomerFindByCriteriaQry;
import com.el.cloud.dto.clientobject.CustomerCO;
import com.el.cloud.entity.CustomerE;
import com.el.cloud.repository.CustomerRepository;
import com.el.cloud.tunnel.datatunnel.CustomerTunnelI;
import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.command.Command;
import org.xujin.halo.command.QueryExecutorI;
import org.xujin.halo.dto.MultiResponse;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Command
public class CustomerFindByCriteriaQueryExe implements QueryExecutorI<MultiResponse<CustomerCO>, CustomerFindByCriteriaQry> {

    @Autowired
    CustomerTunnelI customerDBTunnel;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerConvertor customerConvertor;

    @Override
    public MultiResponse<CustomerCO> execute(CustomerFindByCriteriaQry cmd) {
        List<CustomerE> customerEList = customerRepository.findByCriteria("");
        List<CustomerCO> customerCos = new ArrayList<>();
        for(CustomerE entity:customerEList ) {
            customerCos.add(customerConvertor.entityToClient(entity));
        }
        return MultiResponse.of(customerCos, customerCos.size());
    }

}
