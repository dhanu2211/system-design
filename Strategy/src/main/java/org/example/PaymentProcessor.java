package org.example;

public class PaymentProcessor {
    Pay strategy;

    PaymentProcessor(Pay strategy){
        this.strategy = strategy;
    }

    void pay(double amount){
        strategy.pay(amount);
    }
}
