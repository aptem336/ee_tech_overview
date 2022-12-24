package com.dyachenko.jws;

import com.dyachenko.api.AccountsState;
import com.dyachenko.api.Transaction;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class TransactionService {
    private static final Map<Long, Long> ACCOUNTS_STATE = new HashMap<>();

    @WebMethod(operationName = "addTransaction")
    public AccountsState addTransaction(Transaction transaction) {
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
