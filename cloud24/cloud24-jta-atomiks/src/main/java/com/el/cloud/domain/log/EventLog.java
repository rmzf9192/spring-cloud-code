package com.el.cloud.domain.log;

import javax.persistence.*;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Entity
@PersistenceUnit(unitName="logPersistUnit")
public class EventLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String operation;

    private String operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
