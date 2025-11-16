package org.example;

public class GooglePay implements  Pay{
    @Override
    public void pay(double amount) {
        System.out.println("Payment is done using Google Pay " + amount);
    }
}
