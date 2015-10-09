package com.example.designparttern.creational.singleton;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class SingletonDemo {

    public static void main(String[] args) {
        DataManager object1 = DataManager.getInstance();
        object1.sayHello();


        DataManager object2 = DataManager.getInstance();
        object2.sayHello("object2");


        DataManager.getInstance().sayHello();
    }
}
