package com.el.cloud.dao;

import com.el.cloud.domain.FrozeRequest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public interface FrozeRequestDao extends JpaRepository<FrozeRequest, String> {
}
