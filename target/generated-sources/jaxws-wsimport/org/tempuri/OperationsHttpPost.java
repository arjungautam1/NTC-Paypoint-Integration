
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OperationsHttpPost", targetNamespace = "http://tempuri.org/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OperationsHttpPost {


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
    @WebMethod(operationName = "CheckPayment")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String checkPayment(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "companyCode")
        String companyCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "serviceCode")
        String serviceCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "account")
        String account,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "special1")
        String special1,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "special2")
        String special2,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionDate")
        String transactionDate,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionId")
        String transactionId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userId")
        String userId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "salePointType")
        String salePointType);

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
    @WebMethod(operationName = "ExecutePayment")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String executePayment(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "companyCode")
        String companyCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "serviceCode")
        String serviceCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "account")
        String account,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "special1")
        String special1,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "special2")
        String special2,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionDate")
        String transactionDate,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionId")
        String transactionId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "refStan")
        String refStan,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "amount")
        String amount,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "billNumber")
        String billNumber,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userId")
        String userId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "salePointType")
        String salePointType);

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
    @WebMethod(operationName = "ExecutePaymentEx")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String executePaymentEx(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "companyCode")
        String companyCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "serviceCode")
        String serviceCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "account")
        String account,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "special1")
        String special1,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "special2")
        String special2,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionDate")
        String transactionDate,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionId")
        String transactionId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "refStan")
        String refStan,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "amount")
        String amount,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "billNumber")
        String billNumber,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userId")
        String userId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "salePointType")
        String salePointType,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "paySourceType")
        String paySourceType,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "currencyCode")
        String currencyCode);

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
    @WebMethod(operationName = "AddCancelRequest")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String addCancelRequest(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "companyCode")
        String companyCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "refStan")
        String refStan,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionDate")
        String transactionDate,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionId")
        String transactionId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userId")
        String userId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "salePointType")
        String salePointType);

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
    @WebMethod(operationName = "AddCancelRequestEx")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String addCancelRequestEx(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "companyCode")
        String companyCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "refStan")
        String refStan,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionDate")
        String transactionDate,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionId")
        String transactionId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userId")
        String userId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "salePointType")
        String salePointType,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "note")
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
    @WebMethod(operationName = "GetCompanyInfo")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getCompanyInfo(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "companyCode")
        String companyCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "serviceCode")
        String serviceCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userId")
        String userId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "salePointType")
        String salePointType);

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
    @WebMethod(operationName = "GetTransactionReport")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getTransactionReport(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userLogin")
        String userLogin,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "dealerName")
        String dealerName,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userName")
        String userName,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "startDate")
        String startDate,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "endDate")
        String endDate,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "refStan")
        String refStan,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "salePointType")
        String salePointType,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "status")
        String status);

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
    @WebMethod(operationName = "GetTransactionReportSummary")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getTransactionReportSummary(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userLogin")
        String userLogin,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "dealerName")
        String dealerName,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userName")
        String userName,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "startDate")
        String startDate,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "endDate")
        String endDate,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "refStan")
        String refStan,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "salePointType")
        String salePointType,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "status")
        String status);

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
    @WebMethod(operationName = "GetTransaction")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getTransaction(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userLogin")
        String userLogin,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "stan")
        String stan,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "refStan")
        String refStan,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "key")
        String key,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "billNumber")
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
    @WebMethod(operationName = "GetTransactionEx")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getTransactionEx(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userLogin")
        String userLogin,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "stan")
        String stan,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "refStan")
        String refStan,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "key")
        String key,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "billNumber")
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
    @WebMethod(operationName = "GetTransactionByExternal")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String getTransactionByExternal(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userLogin")
        String userLogin,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "stanEx")
        String stanEx,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "date")
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
    @WebMethod(operationName = "DailyReconciliation")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String dailyReconciliation(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userLogin")
        String userLogin,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "dealerId")
        String dealerId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "companyId")
        String companyId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "day")
        String day,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "totalSum")
        String totalSum,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "totalCount")
        String totalCount);

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
    @WebMethod(operationName = "Retransmit")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public String retransmit(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "companyCode")
        String companyCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "account")
        String account,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionDate")
        String transactionDate,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "transactionId")
        String transactionId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "refStan")
        String refStan,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userId")
        String userId,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userPassword")
        String userPassword,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "salePointType")
        String salePointType,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "note")
        String note);

}
