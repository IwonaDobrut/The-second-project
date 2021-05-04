package com.iwona.PersonStudent;

public class Person {
    private String firstName;
    private String lastName;
    private int birthDate;

    //constructor
    Person (String fN, String lN, int b) {
        firstName = fN;
        lastName = lN;
        birthDate = b;
    }
    // Methods
    String getFirstName() {
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
    int getBirthDate () {
        return birthDate;
    }
    void setFirstName(String fN) {
        firstName = fN;
    }
    void setLastName(String lN) {
        lastName = lN;
    }
    void setBirthDate(int b) {
        birthDate = b;
    }

    void display() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Date: " + birthDate);
    }
}
