package com.example.designparttern.structural.proxy.customergroup;

/**
 * This stupid code is created by thantieuhodo on 10/13/15.
 */
public class Customer implements FilePermission, MoneyPermission {

    public Customer(String name) {
        prepareFile(name);
    }

    private void prepareFile(String name) {
        System.out.println("Customer: prepare, my name is " + name);
    }

    @Override
    public void showFile() {
        System.out.println("Show file");
    }


    public void doOtherThingOfCustomer() {
        System.out.println("do other thing of customer");
    }

    @Override
    public void useMoney() {
        System.out.println("Use money");
    }
}
