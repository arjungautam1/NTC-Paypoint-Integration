/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paypoint.paypointapitesting.ntc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;
import org.json.XML;
import org.tempuri.CheckPayment;

/**
 *
 * @author Focusone-Arjun
 */
public class CheckPaymentServiceImpl implements CheckPaymentService {

    org.tempuri.Operations service = new org.tempuri.Operations();
    org.tempuri.OperationsSoap port = service.getOperationsSoap();

    @Override
    public JSONObject checkPayment(String requestBody) {

        Gson gson = new GsonBuilder().create();
        CheckPayment check = gson.fromJson(requestBody, CheckPayment.class);
        int companyCode = check.getCompanyCode();
        int serviceCode = check.getServiceCode();
        String account = check.getAccount();
        String special1 = check.getTransactionDate();
        String special2 = check.getSpecial2();
        String transactionDate = check.getTransactionDate();
        long transactionId = check.getTransactionId();
        String userId = check.getUserId();
        String userPassword = check.getUserPassword();
        int salePointType = check.getSalePointType();
        String result = port.checkPayment(companyCode, serviceCode, account, special1, special2, transactionDate, transactionId, userId, userPassword, salePointType);
        JSONObject jsonObject = XML.toJSONObject(result);
        System.out.println(jsonObject);
        return jsonObject;

    }

}
