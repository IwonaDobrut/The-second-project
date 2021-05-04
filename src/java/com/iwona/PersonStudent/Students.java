package com.iwona.PersonStudent;

public class Students {

    public static void main(String[] args) {

        Student s1 = new Student("engineer", 1999, "Jan", "Nowak", 1980);

        System.out.println("Information about student: ");
        s1.display1();
        s1.display();

    }
}
