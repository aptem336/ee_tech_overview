
package com.dyachenko.async;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TransactionService", targetNamespace = "http://jws.dyachenko.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TransactionService {


    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<com.dyachenko.async.AccountsState>
     */
    @WebMethod(operationName = "addTransaction")
    public Response<AccountsState> addTransactionAsync(
        @WebParam(name = "arg0", partName = "arg0")
        Transaction arg0);

    /**
     * 
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "addTransaction")
    public Future<?> addTransactionAsync(
        @WebParam(name = "arg0", partName = "arg0")
        Transaction arg0,
        @WebParam(name = "asyncHandler", partName = "asyncHandler")
        AsyncHandler<AccountsState> asyncHandler);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.dyachenko.async.AccountsState
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://jws.dyachenko.com/TransactionService/addTransactionRequest", output = "http://jws.dyachenko.com/TransactionService/addTransactionResponse")
    public AccountsState addTransaction(
        @WebParam(name = "arg0", partName = "arg0")
        Transaction arg0);

}
