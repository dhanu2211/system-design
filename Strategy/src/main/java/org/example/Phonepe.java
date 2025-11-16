package org.example;

public class Phonepe implements Pay{
    @Override
    public void pay(double amount) {
        System.out.println("Paymnet is done via Phonepe " + amount);
    }
}
