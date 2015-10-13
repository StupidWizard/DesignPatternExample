package com.example.designparttern.structural.facade;

/**
 * This stupid code is created by thantieuhodo on 10/13/15.
 */
public class FacadeDemo {

    public static void main(String[] args) {

        // we have school and we know school has teacher, student....
        // but we don't care what they do. we only say to school do something -> school will do the rest.
        SchoolManager schoolManager = new SchoolManager();

        // we can call an easy method:
        schoolManager.process();

        // or call school do some deep method.
        System.out.println("\nOther way =================");
        schoolManager.teacherTeach();
        schoolManager.studentStudy();
    }
}
