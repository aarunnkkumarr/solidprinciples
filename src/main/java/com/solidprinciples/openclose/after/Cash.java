package com.solidprinciples.openclose.after;

public class Cash extends PaymentScheme {

    Cash() {
        setPaymentSchemeName("cash");
    }
    
    public void pay(){
        System.out.println("pay with cash");
    }
}