package com.solidprinciples.openclose.before;

public class CreditCard extends PaymentScheme {
    CreditCard() {
        setPaymentSchemeName("creditcard");
    }
    
    public void pay(){
        System.out.println("pay with credit card");
    }
}