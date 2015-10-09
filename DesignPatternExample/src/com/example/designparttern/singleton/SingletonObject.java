package com.example.designparttern.singleton;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class SingletonObject {

    public static SingletonObject myObject = new SingletonObject();

    private SingletonObject() {
        System.out.println("Singleton: create");
    }

    public static SingletonObject getInstance() {
        return myObject;
    }

    public void sayHello() {
        System.out.println("Singleton: Hello World!");
    }

    public void sayHello(String target) {
        System.out.println("Singleton: " + target + ", Hello World");
    }
}
