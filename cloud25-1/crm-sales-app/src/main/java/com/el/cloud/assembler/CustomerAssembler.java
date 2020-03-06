package com.el.cloud.assembler;

import com.el.cloud.dto.clientobject.CustomerCO;
import org.xujin.halo.assembler.AssemblerI;

import java.util.HashMap;
import java.util.Map;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public class CustomerAssembler implements AssemblerI{

	public Map<String, String> assembleQueryParam(CustomerCO customerCO) {
		
		return new HashMap<>();
	}
}
