package com.example.designparttern.singleton;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class SingletonDemo {

    public static void main(String[] args) {
        SingletonObject object1 = SingletonObject.getInstance();
        object1.sayHello();


        SingletonObject object2 = SingletonObject.getInstance();
        object2.sayHello("object2");


        SingletonObject.getInstance().sayHello();
    }
}
