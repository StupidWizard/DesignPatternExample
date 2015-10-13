package com.example.designparttern.structural.proxy;

import com.example.designparttern.structural.proxy.customergroup.Customer;
import com.example.designparttern.structural.proxy.customergroup.FilePermission;

/**
 * This stupid code is created by thantieuhodo on 10/13/15.
 */
public class ProxyDemo {

    public static final String NAME = "Mr abcxyz";
    public static Customer mrCustomer = new Customer(NAME);

    public static void main(String[] args) {
        FileLawyer fileLawyer = new FileLawyer(NAME);

        // first time show file, lawyer (proxy) must request permission
        System.out.println("First time");
        fileLawyer.showFile();

        // but from seconds time, lawyer (Proxy) can use requested permission.
        System.out.println("\nSecond time");
        fileLawyer.showFile();


        System.out.println("\n======================\n");

        // now, we have an other Lawyer (Proxy) with money permission
        MoneyLawyer moneyLawyer = new MoneyLawyer(NAME);

        System.out.println("First time money");
        moneyLawyer.useMoney();

        System.out.println("\nSecond time money");
        moneyLawyer.useMoney();
    }


    public static Customer requestCustomer(String name) {
        if (name.equalsIgnoreCase(NAME)) {
            return mrCustomer;
        }
        else {
            return new Customer(name);
        }
    }
}
