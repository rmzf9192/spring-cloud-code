package com.el.cloud.validator.extension;


import com.el.cloud.common.BizCode;
import com.el.cloud.dto.CustomerAddCmd;
import com.el.cloud.validator.CustomerAddValidator;
import com.el.cloud.validator.extensionpoint.CustomerAddValidatorExtPt;
import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.annotation.extension.Extension;
import org.xujin.halo.exception.ParamException;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;
import org.xujin.halo.validator.ValidatorCompoiste;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Extension(bizCode = BizCode.DD)
public class CustomerAddDDValidator extends ValidatorCompoiste implements CustomerAddValidatorExtPt {

	private Logger logger = LoggerFactory.getLogger(CustomerAddDDValidator.class);
	
    @Autowired
    private CustomerAddValidator customerAddValidator;

    @Autowired
    private CustomerAddCGSValidator customerAddCGSValidator;

    @Override
    protected void addOtherValidators() {
        // just for demo, 假设钉钉的校验逻辑是在common和CGS的基础上，还有自己额外的校验
        add(customerAddValidator);
    }

    @Override
    protected void doValidate(Object candidate) {
        logger.debug("Do DingDing validation");
        CustomerAddCmd addCustomerCmd = (CustomerAddCmd) candidate;
        //For DD Biz CustomerType could not be null
        if (addCustomerCmd.getCustomer().getCustomerType() == null){
            throw new ParamException("CustomerType could not be null");
        }


    }

}
