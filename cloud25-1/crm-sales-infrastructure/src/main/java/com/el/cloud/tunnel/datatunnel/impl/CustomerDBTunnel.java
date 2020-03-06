package com.el.cloud.tunnel.datatunnel.impl;

import com.el.cloud.dao.CustomerDOMapper;
import com.el.cloud.tunnel.dataobject.CustomerDO;
import com.el.cloud.tunnel.datatunnel.CustomerTunnelI;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Component
public class CustomerDBTunnel implements CustomerTunnelI {

    @Autowired
    private CustomerDOMapper customerDOMapper;

    @Override
    public CustomerDO create(CustomerDO customerDo) {
        customerDo =new CustomerDO();
        customerDo.setCustomerId("8" + RandomUtils.nextLong(1,100000));
        customerDo.setCompanyName("杭州XX公司");
        customerDo.setCompanyType("VIP");
        customerDo.setGlobalId(RandomUtils.nextLong(1,100000)+"");
        customerDo.setMemberId("m"+RandomUtils.nextLong(1,100000));
        customerDOMapper.insert(customerDo);
        return  customerDo;
    }
    
    @Override
    public void update(CustomerDO customerDo) {
        
    }
    
    @Override
    public CustomerDO get(String id) {
        CustomerDO customerDo = new CustomerDO();//just for demo
        return customerDo;
    }

    @Override
    public List<CustomerDO> findByCriteria(String... params) {
        return customerDOMapper.selectByParams(null,null,0,20);
    }

	@Override
	public List<CustomerDO> getByEntity(CustomerDO arg0) {
		return null;
	}

}
