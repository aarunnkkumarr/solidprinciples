package com.solidprinciples.openclose.before;

public class Cash extends PaymentScheme {

    Cash() {
        setPaymentSchemeName("cash");
    }
    
    public void pay(){
        System.out.println("pay with cash");
    }
}