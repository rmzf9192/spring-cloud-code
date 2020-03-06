package com.el.cloud.entity;


import com.el.cloud.repository.ContactRepository;
import com.el.cloud.repository.CustomerRepository;
import com.el.cloud.rule.extensionpoint.CustomerRuleExtPt;
import com.el.cloud.valueobject.CompanyType;
import com.el.cloud.valueobject.SourceType;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.xujin.halo.domain.Entity;
import org.xujin.halo.rule.RuleExecutor;

import java.util.List;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Data
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerE extends Entity {

    private String customerId;
    private String memberId;
    private String globalId;
    private ContactE kp;         // Key Person
    private List<ContactE> contactList;
    private long registeredCapital; //
    private String companyName;
    private SourceType sourceType;
    private CompanyType companyType;

    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private RuleExecutor ruleExecutor;

    public CustomerE() {
    }

    public boolean isBigCompany() {
        return registeredCapital > 10000000; //注册资金大于1000万的是大企业
    }

    public boolean isSME() {
        return registeredCapital > 10000 && registeredCapital < 1000000; //注册资金大于10万小于100万的为中小企业
    }

    public void addNewCustomer() {
        //Add customer policy
        ruleExecutor.execute(CustomerRuleExtPt.class, extension -> extension.addCustomerCheck(this));

        //Persist customer
        customerRepository.persist(this);
    }

}
