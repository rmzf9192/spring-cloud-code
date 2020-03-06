package com.el.cloud.rule.extensionpoint;

import com.el.cloud.entity.CustomerE;
import org.xujin.halo.extension.ExtensionPointI;
import org.xujin.halo.rule.RuleI;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public interface CustomerRuleExtPt extends RuleI, ExtensionPointI{

	//Different business check for different biz
	public boolean addCustomerCheck(CustomerE customerE);

	//Different upgrade policy for different biz
	default public void customerUpgradePolicy(CustomerE customerE){
		//Nothing special
	}
}