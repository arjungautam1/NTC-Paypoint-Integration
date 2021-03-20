
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OperationsSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OperationsSoap {


    /**
     * Check Your account
     * 
     * @param companyCode
     * @param salePointType
     * @param userPassword
     * @param serviceCode
     * @param special1
     * @param special2
     * @param transactionDate
     * @param userId
     * @param account
     * @param transactionId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CheckPayment", action = "http://tempuri.org/CheckPayment")
    @WebResult(name = "CheckPaymentResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CheckPayment", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CheckPayment")
    @ResponseWrapper(localName = "CheckPaymentResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CheckPaymentResponse")
    public String checkPayment(
        @WebParam(name = "companyCode", targetNamespace = "http://tempuri.org/")
        int companyCode,
        @WebParam(name = "serviceCode", targetNamespace = "http://tempuri.org/")
        int serviceCode,
        @WebParam(name = "account", targetNamespace = "http://tempuri.org/")
        String account,
        @WebParam(name = "special1", targetNamespace = "http://tempuri.org/")
        String special1,
        @WebParam(name = "special2", targetNamespace = "http://tempuri.org/")
        String special2,
        @WebParam(name = "transactionDate", targetNamespace = "http://tempuri.org/")
        String transactionDate,
        @WebParam(name = "transactionId", targetNamespace = "http://tempuri.org/")
        long transactionId,
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        String userId,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "salePointType", targetNamespace = "http://tempuri.org/")
        int salePointType);

    /**
     * Top up Your account
     * 
     * @param companyCode
     * @param amount
     * @param userPassword
     * @param serviceCode
     * @param refStan
     * @param special1
     * @param special2
     * @param transactionDate
     * @param userId
     * @param transactionId
     * @param salePointType
     * @param billNumber
     * @param account
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ExecutePayment", action = "http://tempuri.org/ExecutePayment")
    @WebResult(name = "ExecutePaymentResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ExecutePayment", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ExecutePayment")
    @ResponseWrapper(localName = "ExecutePaymentResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ExecutePaymentResponse")
    public String executePayment(
        @WebParam(name = "companyCode", targetNamespace = "http://tempuri.org/")
        int companyCode,
        @WebParam(name = "serviceCode", targetNamespace = "http://tempuri.org/")
        int serviceCode,
        @WebParam(name = "account", targetNamespace = "http://tempuri.org/")
        String account,
        @WebParam(name = "special1", targetNamespace = "http://tempuri.org/")
        String special1,
        @WebParam(name = "special2", targetNamespace = "http://tempuri.org/")
        String special2,
        @WebParam(name = "transactionDate", targetNamespace = "http://tempuri.org/")
        String transactionDate,
        @WebParam(name = "transactionId", targetNamespace = "http://tempuri.org/")
        long transactionId,
        @WebParam(name = "refStan", targetNamespace = "http://tempuri.org/")
        long refStan,
        @WebParam(name = "amount", targetNamespace = "http://tempuri.org/")
        long amount,
        @WebParam(name = "billNumber", targetNamespace = "http://tempuri.org/")
        String billNumber,
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        String userId,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "salePointType", targetNamespace = "http://tempuri.org/")
        int salePointType);

    /**
     * Top up Your account
     * 
     * @param companyCode
     * @param amount
     * @param userPassword
     * @param serviceCode
     * @param refStan
     * @param special1
     * @param special2
     * @param transactionDate
     * @param userId
     * @param transactionId
     * @param salePointType
     * @param paySourceType
     * @param billNumber
     * @param currencyCode
     * @param account
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ExecutePaymentEx", action = "http://tempuri.org/ExecutePaymentEx")
    @WebResult(name = "ExecutePaymentExResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ExecutePaymentEx", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ExecutePaymentEx")
    @ResponseWrapper(localName = "ExecutePaymentExResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ExecutePaymentExResponse")
    public String executePaymentEx(
        @WebParam(name = "companyCode", targetNamespace = "http://tempuri.org/")
        int companyCode,
        @WebParam(name = "serviceCode", targetNamespace = "http://tempuri.org/")
        int serviceCode,
        @WebParam(name = "account", targetNamespace = "http://tempuri.org/")
        String account,
        @WebParam(name = "special1", targetNamespace = "http://tempuri.org/")
        String special1,
        @WebParam(name = "special2", targetNamespace = "http://tempuri.org/")
        String special2,
        @WebParam(name = "transactionDate", targetNamespace = "http://tempuri.org/")
        String transactionDate,
        @WebParam(name = "transactionId", targetNamespace = "http://tempuri.org/")
        long transactionId,
        @WebParam(name = "refStan", targetNamespace = "http://tempuri.org/")
        long refStan,
        @WebParam(name = "amount", targetNamespace = "http://tempuri.org/")
        long amount,
        @WebParam(name = "billNumber", targetNamespace = "http://tempuri.org/")
        String billNumber,
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        String userId,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "salePointType", targetNamespace = "http://tempuri.org/")
        int salePointType,
        @WebParam(name = "paySourceType", targetNamespace = "http://tempuri.org/")
        int paySourceType,
        @WebParam(name = "currencyCode", targetNamespace = "http://tempuri.org/")
        int currencyCode);

    /**
     * Add new cancel transaction request
     * 
     * @param companyCode
     * @param salePointType
     * @param userPassword
     * @param refStan
     * @param transactionDate
     * @param userId
     * @param transactionId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AddCancelRequest", action = "http://tempuri.org/AddCancelRequest")
    @WebResult(name = "AddCancelRequestResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddCancelRequest", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddCancelRequest")
    @ResponseWrapper(localName = "AddCancelRequestResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddCancelRequestResponse")
    public String addCancelRequest(
        @WebParam(name = "companyCode", targetNamespace = "http://tempuri.org/")
        int companyCode,
        @WebParam(name = "refStan", targetNamespace = "http://tempuri.org/")
        long refStan,
        @WebParam(name = "transactionDate", targetNamespace = "http://tempuri.org/")
        String transactionDate,
        @WebParam(name = "transactionId", targetNamespace = "http://tempuri.org/")
        long transactionId,
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        String userId,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "salePointType", targetNamespace = "http://tempuri.org/")
        int salePointType);

    /**
     * Add new cancel transaction request. Need comment
     * 
     * @param companyCode
     * @param salePointType
     * @param note
     * @param userPassword
     * @param refStan
     * @param transactionDate
     * @param userId
     * @param transactionId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AddCancelRequestEx", action = "http://tempuri.org/AddCancelRequestEx")
    @WebResult(name = "AddCancelRequestExResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddCancelRequestEx", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddCancelRequestEx")
    @ResponseWrapper(localName = "AddCancelRequestExResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddCancelRequestExResponse")
    public String addCancelRequestEx(
        @WebParam(name = "companyCode", targetNamespace = "http://tempuri.org/")
        int companyCode,
        @WebParam(name = "refStan", targetNamespace = "http://tempuri.org/")
        long refStan,
        @WebParam(name = "transactionDate", targetNamespace = "http://tempuri.org/")
        String transactionDate,
        @WebParam(name = "transactionId", targetNamespace = "http://tempuri.org/")
        long transactionId,
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        String userId,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "salePointType", targetNamespace = "http://tempuri.org/")
        int salePointType,
        @WebParam(name = "note", targetNamespace = "http://tempuri.org/")
        String note);

    /**
     * Get Company Info
     * 
     * @param companyCode
     * @param salePointType
     * @param userPassword
     * @param serviceCode
     * @param userId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCompanyInfo", action = "http://tempuri.org/GetCompanyInfo")
    @WebResult(name = "GetCompanyInfoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCompanyInfo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCompanyInfo")
    @ResponseWrapper(localName = "GetCompanyInfoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCompanyInfoResponse")
    public String getCompanyInfo(
        @WebParam(name = "companyCode", targetNamespace = "http://tempuri.org/")
        int companyCode,
        @WebParam(name = "serviceCode", targetNamespace = "http://tempuri.org/")
        int serviceCode,
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        String userId,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "salePointType", targetNamespace = "http://tempuri.org/")
        int salePointType);

    /**
     * Get transaction report of successful payments
     * 
     * @param userLogin
     * @param salePointType
     * @param userPassword
     * @param dealerName
     * @param endDate
     * @param refStan
     * @param userName
     * @param startDate
     * @param status
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetTransactionReport", action = "http://tempuri.org/GetTransactionReport")
    @WebResult(name = "GetTransactionReportResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetTransactionReport", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTransactionReport")
    @ResponseWrapper(localName = "GetTransactionReportResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTransactionReportResponse")
    public String getTransactionReport(
        @WebParam(name = "userLogin", targetNamespace = "http://tempuri.org/")
        String userLogin,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "dealerName", targetNamespace = "http://tempuri.org/")
        String dealerName,
        @WebParam(name = "userName", targetNamespace = "http://tempuri.org/")
        String userName,
        @WebParam(name = "startDate", targetNamespace = "http://tempuri.org/")
        String startDate,
        @WebParam(name = "endDate", targetNamespace = "http://tempuri.org/")
        String endDate,
        @WebParam(name = "refStan", targetNamespace = "http://tempuri.org/")
        long refStan,
        @WebParam(name = "salePointType", targetNamespace = "http://tempuri.org/")
        int salePointType,
        @WebParam(name = "status", targetNamespace = "http://tempuri.org/")
        int status);

    /**
     * Get transaction report summary of successful payments
     * 
     * @param userLogin
     * @param salePointType
     * @param userPassword
     * @param dealerName
     * @param endDate
     * @param refStan
     * @param userName
     * @param startDate
     * @param status
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetTransactionReportSummary", action = "http://tempuri.org/GetTransactionReportSummary")
    @WebResult(name = "GetTransactionReportSummaryResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetTransactionReportSummary", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTransactionReportSummary")
    @ResponseWrapper(localName = "GetTransactionReportSummaryResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTransactionReportSummaryResponse")
    public String getTransactionReportSummary(
        @WebParam(name = "userLogin", targetNamespace = "http://tempuri.org/")
        String userLogin,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "dealerName", targetNamespace = "http://tempuri.org/")
        String dealerName,
        @WebParam(name = "userName", targetNamespace = "http://tempuri.org/")
        String userName,
        @WebParam(name = "startDate", targetNamespace = "http://tempuri.org/")
        String startDate,
        @WebParam(name = "endDate", targetNamespace = "http://tempuri.org/")
        String endDate,
        @WebParam(name = "refStan", targetNamespace = "http://tempuri.org/")
        long refStan,
        @WebParam(name = "salePointType", targetNamespace = "http://tempuri.org/")
        int salePointType,
        @WebParam(name = "status", targetNamespace = "http://tempuri.org/")
        int status);

    /**
     * Get payment transaction
     * 
     * @param userLogin
     * @param userPassword
     * @param refStan
     * @param stan
     * @param billNumber
     * @param key
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetTransaction", action = "http://tempuri.org/GetTransaction")
    @WebResult(name = "GetTransactionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetTransaction", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTransaction")
    @ResponseWrapper(localName = "GetTransactionResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTransactionResponse")
    public String getTransaction(
        @WebParam(name = "userLogin", targetNamespace = "http://tempuri.org/")
        String userLogin,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "stan", targetNamespace = "http://tempuri.org/")
        long stan,
        @WebParam(name = "refStan", targetNamespace = "http://tempuri.org/")
        long refStan,
        @WebParam(name = "key", targetNamespace = "http://tempuri.org/")
        String key,
        @WebParam(name = "billNumber", targetNamespace = "http://tempuri.org/")
        String billNumber);

    /**
     * Get payment transaction 2 - not used!!!
     * 
     * @param userLogin
     * @param userPassword
     * @param refStan
     * @param stan
     * @param billNumber
     * @param key
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetTransactionEx", action = "http://tempuri.org/GetTransactionEx")
    @WebResult(name = "GetTransactionExResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetTransactionEx", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTransactionEx")
    @ResponseWrapper(localName = "GetTransactionExResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTransactionExResponse")
    public String getTransactionEx(
        @WebParam(name = "userLogin", targetNamespace = "http://tempuri.org/")
        String userLogin,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "stan", targetNamespace = "http://tempuri.org/")
        long stan,
        @WebParam(name = "refStan", targetNamespace = "http://tempuri.org/")
        long refStan,
        @WebParam(name = "key", targetNamespace = "http://tempuri.org/")
        String key,
        @WebParam(name = "billNumber", targetNamespace = "http://tempuri.org/")
        String billNumber);

    /**
     * Get payment transaction by external stan and date: yyyy-MM-ddTHH:mm:ss
     * 
     * @param userLogin
     * @param date
     * @param userPassword
     * @param stanEx
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetTransactionByExternal", action = "http://tempuri.org/GetTransactionByExternal")
    @WebResult(name = "GetTransactionByExternalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetTransactionByExternal", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTransactionByExternal")
    @ResponseWrapper(localName = "GetTransactionByExternalResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTransactionByExternalResponse")
    public String getTransactionByExternal(
        @WebParam(name = "userLogin", targetNamespace = "http://tempuri.org/")
        String userLogin,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "stanEx", targetNamespace = "http://tempuri.org/")
        long stanEx,
        @WebParam(name = "date", targetNamespace = "http://tempuri.org/")
        String date);

    /**
     * Daily Reconciliation of successful payments
     * 
     * @param userLogin
     * @param totalSum
     * @param userPassword
     * @param companyId
     * @param dealerId
     * @param totalCount
     * @param day
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DailyReconciliation", action = "http://tempuri.org/DailyReconciliation")
    @WebResult(name = "DailyReconciliationResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DailyReconciliation", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DailyReconciliation")
    @ResponseWrapper(localName = "DailyReconciliationResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DailyReconciliationResponse")
    public String dailyReconciliation(
        @WebParam(name = "userLogin", targetNamespace = "http://tempuri.org/")
        String userLogin,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "dealerId", targetNamespace = "http://tempuri.org/")
        int dealerId,
        @WebParam(name = "companyId", targetNamespace = "http://tempuri.org/")
        int companyId,
        @WebParam(name = "day", targetNamespace = "http://tempuri.org/")
        String day,
        @WebParam(name = "totalSum", targetNamespace = "http://tempuri.org/")
        long totalSum,
        @WebParam(name = "totalCount", targetNamespace = "http://tempuri.org/")
        int totalCount);

    /**
     * Resend payment transaction
     * 
     * @param companyCode
     * @param salePointType
     * @param note
     * @param userPassword
     * @param refStan
     * @param transactionDate
     * @param userId
     * @param account
     * @param transactionId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Retransmit", action = "http://tempuri.org/Retransmit")
    @WebResult(name = "RetransmitResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Retransmit", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Retransmit")
    @ResponseWrapper(localName = "RetransmitResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RetransmitResponse")
    public String retransmit(
        @WebParam(name = "companyCode", targetNamespace = "http://tempuri.org/")
        int companyCode,
        @WebParam(name = "account", targetNamespace = "http://tempuri.org/")
        String account,
        @WebParam(name = "transactionDate", targetNamespace = "http://tempuri.org/")
        String transactionDate,
        @WebParam(name = "transactionId", targetNamespace = "http://tempuri.org/")
        long transactionId,
        @WebParam(name = "refStan", targetNamespace = "http://tempuri.org/")
        long refStan,
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        String userId,
        @WebParam(name = "userPassword", targetNamespace = "http://tempuri.org/")
        String userPassword,
        @WebParam(name = "salePointType", targetNamespace = "http://tempuri.org/")
        int salePointType,
        @WebParam(name = "note", targetNamespace = "http://tempuri.org/")
        String note);

}