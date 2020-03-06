package com.el.cloud.command;


import com.el.cloud.convertor.extensionpoint.CustomerConvertorExtPt;
import com.el.cloud.dto.CustomerAddCmd;
import com.el.cloud.entity.CustomerE;
import com.el.cloud.validator.extensionpoint.CustomerAddValidatorExtPt;
import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.command.Command;
import org.xujin.halo.command.CommandExecutorI;
import org.xujin.halo.dto.Response;
import org.xujin.halo.extension.ExtensionExecutor;
import org.xujin.halo.validator.ValidatorExecutor;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Command
public class CustomerAddCmdExe implements CommandExecutorI<Response, CustomerAddCmd>{

    /**
     * 依赖注入校验执行器
     */
    @Autowired
    private ValidatorExecutor  validatorExecutor;

    /**
     * 依赖注入扩展点执行器
     */
    @Autowired
    private ExtensionExecutor extensionExecutor;

    @Override
    public Response execute(CustomerAddCmd cmd) {
        //1, validation
    	validatorExecutor.validate(CustomerAddValidatorExtPt.class, cmd);
    	
        //2, invoke domain service or directly operate domain to do business logic process
        CustomerE customerEntity = extensionExecutor.execute(CustomerConvertorExtPt.class, extension -> extension.clientToEntity(cmd.getCustomer()));
        customerEntity.addNewCustomer();

        //3, notify by sending message out
        return Response.buildSuccess();
    }

}
