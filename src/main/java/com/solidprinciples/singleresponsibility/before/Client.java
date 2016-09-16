package com.solidprinciples.singleresponsibility.before;

public class Client {
    
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setName("Arun");
        person.setEmailAddress("java.aarunn@gmail.com.com");
        person.setEmailContent("Hello, Arun!");
        person.sendEmail();
    }

}
