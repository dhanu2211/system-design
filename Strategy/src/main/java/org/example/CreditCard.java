package org.example;

public class CreditCard implements Pay{
    @Override
    public void pay(double amount) {
        System.out.println("Payment is done via Credit card "+amount);
    }
}
