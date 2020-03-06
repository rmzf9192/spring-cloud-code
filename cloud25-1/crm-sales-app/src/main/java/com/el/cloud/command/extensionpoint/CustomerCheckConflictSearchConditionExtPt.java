package com.el.cloud.command.extensionpoint;

import org.xujin.halo.extension.ExtensionPointI;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public interface CustomerCheckConflictSearchConditionExtPt extends ExtensionPointI{
    
    public String getSearchCondition(String condition);
}
