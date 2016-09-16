package com.solidprinciples.singleresponsibility.after;

public class Person {

	private String name;

	private Email email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name: " + name + " email: " + email;
	}

}