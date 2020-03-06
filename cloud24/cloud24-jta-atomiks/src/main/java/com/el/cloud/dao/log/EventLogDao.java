package com.el.cloud.dao.log;

import com.el.cloud.domain.log.EventLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public interface EventLogDao extends JpaRepository<EventLog, Integer> {
}
