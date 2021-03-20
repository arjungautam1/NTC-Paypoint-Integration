/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paypoint.paypointapitesting;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paypoint.paypointapitesting.ntc.CheckPaymentServiceImpl;
import static spark.Spark.*;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.json.XML;

/**
 *
 * @author Focusone-Arjun
 */
public class RestPaypoint {

    private static ObjectMapper om = new ObjectMapper();

    public static void main(String[] args) {

        try {
            CheckPaymentServiceImpl checkpaymentServie = new CheckPaymentServiceImpl();

            port(8080);
            staticFiles.location("/html");
            init();

            get("/index", (request, response) -> {
                response.type("text/html");
                response.redirect("welcome.html");
                return "";
            });

            get("/", (req, res) -> {
                res.type("text/html");
                res.redirect("welcome.html");
                return "";
            });

            post("/checkPayment", (request, response) -> {
                try {
                    response.type("application/json");
                    String data = request.body();
                    return checkpaymentServie.checkPayment(data);
                } catch (Exception e) {
                    System.out.println("error: " + e.getMessage());
                    return om.writeValueAsString(e.getMessage());

                }
            });
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
