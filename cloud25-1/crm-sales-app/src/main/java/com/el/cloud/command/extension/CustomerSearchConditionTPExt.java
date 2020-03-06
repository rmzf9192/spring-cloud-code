package com.el.cloud.command.extension;


import com.el.cloud.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import com.el.cloud.common.BizCode;
import org.xujin.halo.annotation.extension.Extension;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Extension(bizCode = BizCode.TP)
public class CustomerSearchConditionTPExt implements CustomerCheckConflictSearchConditionExtPt {

    @Override
    public String getSearchCondition(String condition) {
        return "Trust Pass Search Condition";
    }

}
