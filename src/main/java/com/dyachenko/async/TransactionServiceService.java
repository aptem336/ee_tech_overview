
package com.dyachenko.async;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TransactionServiceService", targetNamespace = "http://jws.dyachenko.com/", wsdlLocation = "http://localhost:8080/transaction?wsdl")
public class TransactionServiceService
    extends Service
{

    private final static URL TRANSACTIONSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException TRANSACTIONSERVICESERVICE_EXCEPTION;
    private final static QName TRANSACTIONSERVICESERVICE_QNAME = new QName("http://jws.dyachenko.com/", "TransactionServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/transaction?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSACTIONSERVICESERVICE_WSDL_LOCATION = url;
        TRANSACTIONSERVICESERVICE_EXCEPTION = e;
    }

    public TransactionServiceService() {
        super(__getWsdlLocation(), TRANSACTIONSERVICESERVICE_QNAME);
    }

    public TransactionServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSACTIONSERVICESERVICE_QNAME, features);
    }

    public TransactionServiceService(URL wsdlLocation) {
        super(wsdlLocation, TRANSACTIONSERVICESERVICE_QNAME);
    }

    public TransactionServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSACTIONSERVICESERVICE_QNAME, features);
    }

    public TransactionServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransactionServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TransactionService
     */
    @WebEndpoint(name = "TransactionServicePort")
    public TransactionService getTransactionServicePort() {
        return super.getPort(new QName("http://jws.dyachenko.com/", "TransactionServicePort"), TransactionService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransactionService
     */
    @WebEndpoint(name = "TransactionServicePort")
    public TransactionService getTransactionServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jws.dyachenko.com/", "TransactionServicePort"), TransactionService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSACTIONSERVICESERVICE_EXCEPTION!= null) {
            throw TRANSACTIONSERVICESERVICE_EXCEPTION;
        }
        return TRANSACTIONSERVICESERVICE_WSDL_LOCATION;
    }

}
