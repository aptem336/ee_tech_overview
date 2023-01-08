package com.dyachenko.api;

import java.util.HashMap;
import java.util.Map;

public interface TransactionService {
    Map<Long, Long> ACCOUNTS_STATE = new HashMap<>();

    default AccountsState addTransaction(Transaction transaction) {
        if (!ACCOUNTS_STATE.containsKey(transaction.getOutcomeAccountId())) {
            ACCOUNTS_STATE.put(transaction.getOutcomeAccountId(), 0L);
        }
        if (!ACCOUNTS_STATE.containsKey(transaction.getIncomeAccountId())) {
            ACCOUNTS_STATE.put(transaction.getIncomeAccountId(), 0L);
        }
        ACCOUNTS_STATE.put(transaction.getOutcomeAccountId(),
                ACCOUNTS_STATE.get(transaction.getOutcomeAccountId()) - transaction.getSum());
        ACCOUNTS_STATE.put(transaction.getIncomeAccountId(),
                ACCOUNTS_STATE.get(transaction.getIncomeAccountId()) + transaction.getSum());
        return new AccountsState(ACCOUNTS_STATE);
    }
}
