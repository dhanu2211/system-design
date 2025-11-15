package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmailBuilder builder = new EmailBuilder();
        Email email = builder.setTo("Me")
                .setCc("Someone")
                .setBody("Hi how are you..")
                .build();
        System.out.println("Email is ready!!  " + email.toString());
    }
}