package com.dyachenko.async;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.util.concurrent.ExecutionException;

public class TransactionServiceClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException, JAXBException {
        TransactionServiceService transactionServiceService = new TransactionServiceService();
        TransactionService transactionServicePort = transactionServiceService.getTransactionServicePort();
        AccountsState accountsState = transactionServicePort.addTransactionAsync(new Transaction() {{
            setIncomeAccountId(1L);
            setIncomeAccountId(2L);
            setSum(1000L);
        }}).get();
        JAXBContext jaxbContext = JAXBContext.newInstance(AccountsState.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        JAXBElement<AccountsState> accountStateJaxbElement = new JAXBElement<>(
                new QName("", "accountsState"),
                AccountsState.class,
                accountsState);
        jaxbMarshaller.marshal(accountStateJaxbElement, System.out);
    }
}
