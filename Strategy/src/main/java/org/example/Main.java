package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number for which payment you want to use");
        System.out.println("1. GooglePay");
        System.out.println("2. Credit Card");
        System.out.println("3. Phonepe");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();

        System.out.println("Enter the amount");
        double amount = sc.nextDouble();

        PaymentProcessor processor;
        switch (type){
            case 1:
                processor = new PaymentProcessor(new GooglePay());
                processor.pay(amount);
                break;
            case 2:
                processor = new PaymentProcessor(new CreditCard());
                processor.pay(amount);
                break;
            case 3:
                processor = new PaymentProcessor(new Phonepe());
                processor.pay(amount);
                break;
            default:
                System.out.println("Choose the correct payment method");
                break;
        }
    }
}