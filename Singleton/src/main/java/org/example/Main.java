package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            SingletonJava.getSingletonObject("Object 1");
        });
        Thread t2 = new Thread(()->{
            SingletonJava.getSingletonObject("object 2");
        });
        Thread t3 = new Thread(()->{
            SingletonJava.getSingletonObject("object 3");
        });
        t1.start();
        t2.start();
        t3.start();
    }
}