package com.solidprinciples.openclose.after;

public class Customer {

	public void pay(PaymentSchemeAbstraction paymentScheme) {

		paymentScheme.pay();
	}

}