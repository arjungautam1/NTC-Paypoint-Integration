/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paypoint.paypointapitesting.ntc;

import org.json.JSONObject;
import org.tempuri.CheckPayment;

/**
 *
 * @author Focusone-Arjun
 */
public interface CheckPaymentService {

    public JSONObject checkPayment(String requestBody);

}
