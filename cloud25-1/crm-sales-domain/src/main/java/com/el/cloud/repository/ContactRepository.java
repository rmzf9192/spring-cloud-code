package com.el.cloud.repository;

import cn.springcloud.book.crm.sales.domain.customer.entity.ContactE;
import org.springframework.stereotype.Repository;
import org.xujin.halo.context.HaloContext;
import org.xujin.halo.repository.RepositoryI;

import java.util.Set;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Repository
public class ContactRepository implements RepositoryI {

	public Set<ContactE> queryContactByGlobalId(String globalId, String type){
		HaloContext.getExtBizCode();
		HaloContext.getBizCode();
		return null;
	}

}
