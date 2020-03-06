package com.el.cloud.command.extension;

import com.el.cloud.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import org.xujin.halo.annotation.extension.Extension;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Extension
public class CustomerSearchConditionExt implements CustomerCheckConflictSearchConditionExtPt {

    @Override
    public String getSearchCondition(String condition) {
        return "default Search Condition";
    }

}
