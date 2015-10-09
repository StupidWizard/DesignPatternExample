package com.example.designparttern.creational.singleton;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class DataManager {
    private static DataManager ourInstance = new DataManager();

    private DataManager() {
        System.out.println("DataManager created!");
    }



    public static DataManager getInstance() {
        return ourInstance;
    }



    public void sayHello() {
        System.out.println("DataManager: hello!");
    }

    public void sayHello(String target) {
        System.out.println("DataManager: " + target + ", hello!");
    }
}
