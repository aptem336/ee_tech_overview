package com.dyachenko.jwsrs;

import com.dyachenko.api.TransactionService;
import com.dyachenko.api.AccountsState;
import com.dyachenko.api.Transaction;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/transaction")
public class TransactionServiceRest implements TransactionService {
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @POST
    @Override
    public AccountsState addTransaction(Transaction transaction) {
        return TransactionService.super.addTransaction(transaction);
    }
}
