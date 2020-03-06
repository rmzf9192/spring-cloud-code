package com.el.cloud.command;


import com.el.cloud.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import com.el.cloud.dto.CustomerCheckConflictCmd;
import com.el.cloud.dto.clientobject.CustomerCO;
import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.command.Command;
import org.xujin.halo.command.CommandExecutorI;
import org.xujin.halo.dto.MultiResponse;
import org.xujin.halo.extension.ExtensionExecutor;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Command
public class CustomerCheckConflictCmdExe implements CommandExecutorI<MultiResponse<CustomerCO>, CustomerCheckConflictCmd>{

    @Autowired
    private ExtensionExecutor extensionExecutor;
    
    @Override
    public MultiResponse<CustomerCO> execute(CustomerCheckConflictCmd cmd) {
        System.out.println("Shared logic");
        String searchCondition = extensionExecutor.execute(
                                   CustomerCheckConflictSearchConditionExtPt.class,
                                   extension -> extension.getSearchCondition("condition"));
        System.out.println("Shared logic with "+ searchCondition);
        return MultiResponse.of(null, 0);
    }

}
