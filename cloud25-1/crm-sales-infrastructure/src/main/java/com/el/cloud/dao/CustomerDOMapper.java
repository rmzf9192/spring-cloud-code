package com.el.cloud.dao;

import com.el.cloud.tunnel.dataobject.CustomerDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public interface CustomerDOMapper {
    int deleteByPrimaryKey(String customerId);

    int insert(CustomerDO record);

    int insertSelective(CustomerDO record);

    CustomerDO selectByPrimaryKey(String customerId);

    int updateByPrimaryKeySelective(CustomerDO record);

    int updateByPrimaryKey(CustomerDO record);

    List<CustomerDO> selectByParams(@Param("customerId") String customerId, @Param("memberId") String memberId, @Param("offset") long offset, @Param("limit") long limit);

    int countByParams(@Param("customerId") String customerId, @Param("memberId") String memberId);
}