package com.dyachenko.jws;

import com.dyachenko.api.AccountsState;
import com.dyachenko.api.Transaction;
import com.dyachenko.api.TransactionService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class TransactionServiceSoap implements TransactionService {
    @Override
    @WebMethod(operationName = "addTransaction")
    public AccountsState addTransaction(Transaction transaction) {
        return TransactionService.super.addTransaction(transaction);
    }
}
