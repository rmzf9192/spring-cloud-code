package com.el.cloud.config;

import org.hibernate.engine.transaction.jta.platform.internal.AbstractJtaPlatform;

import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public class AtomikosJtaPlatform extends AbstractJtaPlatform {

    private static TransactionManager transactionManager;

    private static UserTransaction userTransaction;

    public static void setTransactionManager(TransactionManager transactionManager) {
        AtomikosJtaPlatform.transactionManager = transactionManager;
    }

    public static void setUserTransaction(UserTransaction userTransaction) {
        AtomikosJtaPlatform.userTransaction = userTransaction;
    }

    @Override
    protected TransactionManager locateTransactionManager() {
        return transactionManager;
    }

    @Override
    protected UserTransaction locateUserTransaction() {
        return userTransaction;
    }
}
