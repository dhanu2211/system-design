package org.example;

public class SingletonJava {
    private static volatile SingletonJava instance;

    private SingletonJava(String name){
        System.out.println("Singleton object is created " + name);
    }

    //double check locking
    //Singleton in multithreaded environment
    public static SingletonJava getSingletonObject(String name) {
        if (instance == null) {
            synchronized (SingletonJava.class) {
                if (instance == null) {
                    instance = new SingletonJava(name);
                }
            }

        }
        return instance;
    }
}
