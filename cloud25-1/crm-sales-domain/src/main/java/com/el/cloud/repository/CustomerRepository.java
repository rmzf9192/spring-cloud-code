package com.el.cloud.repository;


import com.el.cloud.convertor.CustomerConvertor;
import com.el.cloud.entity.CustomerE;
import com.el.cloud.tunnel.dataobject.CustomerDO;
import com.el.cloud.tunnel.datatunnel.CustomerTunnelI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xujin.halo.repository.RepositoryI;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Repository
public class CustomerRepository implements RepositoryI{

    @Autowired
    private CustomerTunnelI customerDBTunnel;

    @Autowired
    private CustomerConvertor customerConvertor;

    public void persist(CustomerE customer) {
        customerDBTunnel.create(customerConvertor.entityToData(customer));
    }
    
    public List<CustomerE> findByCriteria(String... params){
        List<CustomerDO> customerDos = customerDBTunnel.findByCriteria(params);
        List<CustomerE> customerDs = new ArrayList<>();
        for (CustomerDO customerDo : customerDos) {
            customerDs.add(customerConvertor.dataToEntity(customerDo));
        }
        return customerDs;
    }
}
