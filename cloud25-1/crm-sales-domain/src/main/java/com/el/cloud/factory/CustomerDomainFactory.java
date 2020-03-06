package com.el.cloud.factory;

import cn.springcloud.book.crm.sales.domain.customer.entity.CustomerE;
import cn.springcloud.book.crm.sales.domain.customer.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xujin.halo.domain.DomainFactoryI;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Component
public class CustomerDomainFactory implements DomainFactoryI<CustomerE>{

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public CustomerE create(){
		return new CustomerE();
	}

}
