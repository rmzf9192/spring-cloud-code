package com.el.cloud.validator.extension;


import com.el.cloud.common.BizCode;
import com.el.cloud.dto.CustomerAddCmd;
import com.el.cloud.dto.clientobject.CustomerType;
import com.el.cloud.validator.CustomerAddValidator;
import com.el.cloud.validator.extensionpoint.CustomerAddValidatorExtPt;
import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.annotation.extension.Extension;
import org.xujin.halo.exception.BizException;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;
import org.xujin.halo.validator.ValidatorCompoiste;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Extension(bizCode = BizCode.CGS)
public class CustomerAddCGSValidator extends ValidatorCompoiste implements CustomerAddValidatorExtPt {

	private Logger logger = LoggerFactory.getLogger(CustomerAddCGSValidator.class);
	
    @Autowired
    private CustomerAddValidator customerAddValidator;

    @Override
    protected void addOtherValidators() {
        add(customerAddValidator);
    }

    @Override
    protected void doValidate(Object candidate) {
    	logger.debug("This is CGS validation");
        CustomerAddCmd addCustomerCmd = (CustomerAddCmd) candidate;
        //For CGS BIZ CustomerTYpe could not be VIP
        if(CustomerType.VIP == addCustomerCmd.getCustomer().getCustomerType())
        {
            throw new BizException("VIP Customer can not be added by CGS");
        }

    }

}
