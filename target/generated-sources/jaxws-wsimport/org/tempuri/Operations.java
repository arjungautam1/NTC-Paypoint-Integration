
package org.tempuri;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Operations", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://test.paypoint.md:4445/PayPointWS/PayPointMSOperations.asmx?wsdl")
public class Operations
    extends Service
{

    private final static URL OPERATIONS_WSDL_LOCATION;
    private final static WebServiceException OPERATIONS_EXCEPTION;
    private final static QName OPERATIONS_QNAME = new QName("http://tempuri.org/", "Operations");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://test.paypoint.md:4445/PayPointWS/PayPointMSOperations.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPERATIONS_WSDL_LOCATION = url;
        OPERATIONS_EXCEPTION = e;
    }

    public Operations() {
        super(__getWsdlLocation(), OPERATIONS_QNAME);
    }

    public Operations(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPERATIONS_QNAME, features);
    }

    public Operations(URL wsdlLocation) {
        super(wsdlLocation, OPERATIONS_QNAME);
    }

    public Operations(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPERATIONS_QNAME, features);
    }

    public Operations(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Operations(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OperationsSoap
     */
    @WebEndpoint(name = "OperationsSoap")
    public OperationsSoap getOperationsSoap() {
        return super.getPort(new QName("http://tempuri.org/", "OperationsSoap"), OperationsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperationsSoap
     */
    @WebEndpoint(name = "OperationsSoap")
    public OperationsSoap getOperationsSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "OperationsSoap"), OperationsSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns OperationsSoap
     */
    @WebEndpoint(name = "OperationsSoap12")
    public OperationsSoap getOperationsSoap12() {
        return super.getPort(new QName("http://tempuri.org/", "OperationsSoap12"), OperationsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperationsSoap
     */
    @WebEndpoint(name = "OperationsSoap12")
    public OperationsSoap getOperationsSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "OperationsSoap12"), OperationsSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns OperationsHttpGet
     */
    @WebEndpoint(name = "OperationsHttpGet")
    public OperationsHttpGet getOperationsHttpGet() {
        return super.getPort(new QName("http://tempuri.org/", "OperationsHttpGet"), OperationsHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperationsHttpGet
     */
    @WebEndpoint(name = "OperationsHttpGet")
    public OperationsHttpGet getOperationsHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "OperationsHttpGet"), OperationsHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns OperationsHttpPost
     */
    @WebEndpoint(name = "OperationsHttpPost")
    public OperationsHttpPost getOperationsHttpPost() {
        return super.getPort(new QName("http://tempuri.org/", "OperationsHttpPost"), OperationsHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperationsHttpPost
     */
    @WebEndpoint(name = "OperationsHttpPost")
    public OperationsHttpPost getOperationsHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "OperationsHttpPost"), OperationsHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPERATIONS_EXCEPTION!= null) {
            throw OPERATIONS_EXCEPTION;
        }
        return OPERATIONS_WSDL_LOCATION;
    }

}
