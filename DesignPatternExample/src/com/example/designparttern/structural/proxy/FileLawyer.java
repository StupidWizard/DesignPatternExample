package com.example.designparttern.structural.proxy;

import com.example.designparttern.structural.proxy.customergroup.FilePermission;

/**
 * This stupid code is created by thantieuhodo on 10/13/15.
 */
public class FileLawyer implements FilePermission {

    private FilePermission myCustomer;      // type of customer is "FilePermission"
    private String customerName;

    public FileLawyer(String customerName) {
        // we create FileLawyer but now, lawyer still has no permission.
        this.customerName = customerName;
    }

    @Override
    public void showFile() {
        // lawyer can only show file when has permission from customer -> check customer (permission)
        if (myCustomer == null) {
            System.out.println("FileLawyer request");
            myCustomer = ProxyDemo.requestCustomer(customerName);
        }

        myCustomer.showFile();
    }
}
