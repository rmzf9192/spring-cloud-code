package com.el.cloud;


import com.alibaba.fastjson.JSONObject;
import com.el.cloud.api.CustomerServiceI;
import com.el.cloud.dto.CustomerAddCmd;
import com.el.cloud.dto.CustomerCheckConflictCmd;
import com.el.cloud.dto.CustomerFindByCriteriaQry;
import com.el.cloud.dto.clientobject.CustomerCO;
import com.el.cloud.dto.clientobject.CustomerType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xujin.halo.context.HaloContext;
import org.xujin.halo.dto.MultiResponse;
import org.xujin.halo.dto.Response;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    private Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerServiceI customerService;

    @RequestMapping("/add")
    public Response add(){
        logger.info("init add");
        //1.Prepare
        HaloContext.set("DD","10001");
        CustomerAddCmd cmd = new CustomerAddCmd();
        CustomerCO customerCO = new CustomerCO();
        customerCO.setCustomerName("jkys");
        customerCO.setCustomerType(CustomerType.VIP);
        cmd.setCustomer(customerCO);

        //2.Execute
        Response response = customerService.addCustomer(cmd);

        return response;

    }

    @RequestMapping("/list")
    public MultiResponse<CustomerCO> list(){
        MultiResponse<CustomerCO>  list = null;
        try {
            logger.info("init list");
            CustomerFindByCriteriaQry qry = new CustomerFindByCriteriaQry();
            list = customerService.findByCriteria(qry);
            list.getTotal();
            logger.info(JSONObject.toJSONString(list.getData(),true));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    @RequestMapping("/checkConflict")
    public MultiResponse<CustomerCO> checkConflict(){
        logger.info("init checkConflict");
        HaloContext.set("","10001");
        CustomerCheckConflictCmd customerCheckConflictCmd=new CustomerCheckConflictCmd();
        customerCheckConflictCmd.setOperater("xujin");
        MultiResponse<CustomerCO>  list = customerService.checkConflict(customerCheckConflictCmd);
        return list;

    }



}
