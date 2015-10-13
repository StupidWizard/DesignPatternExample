package com.example.designparttern.structural.facade;

import com.example.designparttern.structural.facade.schoolgroup.Student;
import com.example.designparttern.structural.facade.schoolgroup.Teacher;

/**
 * This stupid code is created by thantieuhodo on 10/13/15.
 */
public class SchoolManager {

    private Teacher myTeacher;
    private Student myStudent;

    public SchoolManager() {
        myTeacher = new Teacher();
        myStudent = new Student();
    }


    public void process() {
        System.out.println("School: process");
        teacherTeach();
        studentStudy();
    }

    public void teacherTeach() {
        if (myTeacher != null) {
            myTeacher.prepare();
            myTeacher.teach();
        }
    }

    public void studentStudy() {
        if (myStudent != null) {
            myStudent.study();

            // when finish lesson, students should be do exam...
        }
    }
}
