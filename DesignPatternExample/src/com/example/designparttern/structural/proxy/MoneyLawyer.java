package com.example.designparttern.structural.proxy;

import com.example.designparttern.structural.proxy.customergroup.MoneyPermission;

/**
 * This stupid code is created by thantieuhodo on 10/13/15.
 */
public class MoneyLawyer implements MoneyPermission {

    private String name;
    private MoneyPermission myCustomer;

    public MoneyLawyer(String name) {
        this.name = name;
    }

    @Override
    public void useMoney() {
        if (myCustomer == null) {
            System.out.println("MoneyLawyer request");
            myCustomer = ProxyDemo.requestCustomer(name);
        }

        myCustomer.useMoney();
    }
}
