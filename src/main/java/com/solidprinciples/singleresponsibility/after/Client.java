package com.solidprinciples.singleresponsibility.after;

public class Client {
    
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setName("Arun");
        Email email = new Email();
        email.setEmailContent("Hello, Arun!");
        EmailSender emailSender = new EmailSender(email,"java.aarunn@gmail.com");
        emailSender.sendEmail();
        
        System.out.println("Demonstration of Single Responsibility - (S)OLID");
        
    }

}
