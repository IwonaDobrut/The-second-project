package com.iwona.PersonStudent;

public class Student extends Person {
    private String faculty;
    private int graduateYear;

    Student(String f, int g, String fN, String lN, int b) {
        super(fN, lN, b);
        faculty = f;
        graduateYear = g;
    }
    String getFaculty() {
        return faculty;
    }

    int getGraduateYear() {
        return graduateYear;
    }
    void setFaculty(String f) {
        faculty = f;
    }
    void setGraduateYear(int g) {
        graduateYear = g;
    }
    void display1() {
        System.out.println("Faculty:" + faculty);
        System.out.println("Graduate Year: " + graduateYear);
    }
}




