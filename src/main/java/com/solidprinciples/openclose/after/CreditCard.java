package com.solidprinciples.openclose.after;

public class CreditCard extends PaymentSchemeAbstraction {
	@Override
	public void pay() {
		System.out.println("pay with cash");
	}
}