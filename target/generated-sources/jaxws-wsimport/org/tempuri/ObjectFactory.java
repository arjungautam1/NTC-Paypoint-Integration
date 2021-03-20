
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _String_QNAME = new QName("http://tempuri.org/", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExecutePaymentExResponse }
     * 
     */
    public ExecutePaymentExResponse createExecutePaymentExResponse() {
        return new ExecutePaymentExResponse();
    }

    /**
     * Create an instance of {@link GetTransactionEx }
     * 
     */
    public GetTransactionEx createGetTransactionEx() {
        return new GetTransactionEx();
    }

    /**
     * Create an instance of {@link GetTransactionByExternal }
     * 
     */
    public GetTransactionByExternal createGetTransactionByExternal() {
        return new GetTransactionByExternal();
    }

    /**
     * Create an instance of {@link ExecutePayment }
     * 
     */
    public ExecutePayment createExecutePayment() {
        return new ExecutePayment();
    }

    /**
     * Create an instance of {@link CheckPaymentResponse }
     * 
     */
    public CheckPaymentResponse createCheckPaymentResponse() {
        return new CheckPaymentResponse();
    }

    /**
     * Create an instance of {@link GetTransactionReport }
     * 
     */
    public GetTransactionReport createGetTransactionReport() {
        return new GetTransactionReport();
    }

    /**
     * Create an instance of {@link GetTransactionReportSummary }
     * 
     */
    public GetTransactionReportSummary createGetTransactionReportSummary() {
        return new GetTransactionReportSummary();
    }

    /**
     * Create an instance of {@link AddCancelRequest }
     * 
     */
    public AddCancelRequest createAddCancelRequest() {
        return new AddCancelRequest();
    }

    /**
     * Create an instance of {@link GetCompanyInfoResponse }
     * 
     */
    public GetCompanyInfoResponse createGetCompanyInfoResponse() {
        return new GetCompanyInfoResponse();
    }

    /**
     * Create an instance of {@link AddCancelRequestEx }
     * 
     */
    public AddCancelRequestEx createAddCancelRequestEx() {
        return new AddCancelRequestEx();
    }

    /**
     * Create an instance of {@link Retransmit }
     * 
     */
    public Retransmit createRetransmit() {
        return new Retransmit();
    }

    /**
     * Create an instance of {@link ExecutePaymentResponse }
     * 
     */
    public ExecutePaymentResponse createExecutePaymentResponse() {
        return new ExecutePaymentResponse();
    }

    /**
     * Create an instance of {@link GetTransactionReportResponse }
     * 
     */
    public GetTransactionReportResponse createGetTransactionReportResponse() {
        return new GetTransactionReportResponse();
    }

    /**
     * Create an instance of {@link RetransmitResponse }
     * 
     */
    public RetransmitResponse createRetransmitResponse() {
        return new RetransmitResponse();
    }

    /**
     * Create an instance of {@link GetTransactionReportSummaryResponse }
     * 
     */
    public GetTransactionReportSummaryResponse createGetTransactionReportSummaryResponse() {
        return new GetTransactionReportSummaryResponse();
    }

    /**
     * Create an instance of {@link ExecutePaymentEx }
     * 
     */
    public ExecutePaymentEx createExecutePaymentEx() {
        return new ExecutePaymentEx();
    }

    /**
     * Create an instance of {@link AddCancelRequestResponse }
     * 
     */
    public AddCancelRequestResponse createAddCancelRequestResponse() {
        return new AddCancelRequestResponse();
    }

    /**
     * Create an instance of {@link DailyReconciliationResponse }
     * 
     */
    public DailyReconciliationResponse createDailyReconciliationResponse() {
        return new DailyReconciliationResponse();
    }

    /**
     * Create an instance of {@link DailyReconciliation }
     * 
     */
    public DailyReconciliation createDailyReconciliation() {
        return new DailyReconciliation();
    }

    /**
     * Create an instance of {@link GetTransaction }
     * 
     */
    public GetTransaction createGetTransaction() {
        return new GetTransaction();
    }

    /**
     * Create an instance of {@link CheckPayment }
     * 
     */
    public CheckPayment createCheckPayment() {
        return new CheckPayment();
    }

    /**
     * Create an instance of {@link AddCancelRequestExResponse }
     * 
     */
    public AddCancelRequestExResponse createAddCancelRequestExResponse() {
        return new AddCancelRequestExResponse();
    }

    /**
     * Create an instance of {@link GetTransactionResponse }
     * 
     */
    public GetTransactionResponse createGetTransactionResponse() {
        return new GetTransactionResponse();
    }

    /**
     * Create an instance of {@link GetTransactionByExternalResponse }
     * 
     */
    public GetTransactionByExternalResponse createGetTransactionByExternalResponse() {
        return new GetTransactionByExternalResponse();
    }

    /**
     * Create an instance of {@link GetTransactionExResponse }
     * 
     */
    public GetTransactionExResponse createGetTransactionExResponse() {
        return new GetTransactionExResponse();
    }

    /**
     * Create an instance of {@link GetCompanyInfo }
     * 
     */
    public GetCompanyInfo createGetCompanyInfo() {
        return new GetCompanyInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
