package com.el.cloud.validator;

import com.el.cloud.dto.CustomerAddCmd;
import com.el.cloud.validator.extensionpoint.CustomerAddValidatorExtPt;
import org.springframework.stereotype.Component;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Component
public class CustomerAddValidator implements CustomerAddValidatorExtPt {

	private Logger logger = LoggerFactory.getLogger(CustomerAddValidator.class);
	
	@Override
	public void validate(Object candidate) {
		logger.debug("Do common validation");
		CustomerAddCmd addCmd = (CustomerAddCmd)candidate;
	}
}
