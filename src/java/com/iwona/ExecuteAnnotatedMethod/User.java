package com.iwona.ExecuteAnnotatedMethod;

public class User {
    String name;
    String surname;

    User(String n, String sn) {
        name = n;
        surname = sn;
    }
    @Execute(str = "TIMES", value = 3)
    String name() {
        return name;
    }

    String surname() {
        return surname;
    }

    @Execute(str = "TIMES", value = 3)
    void saySomething (){
        for ( int i = 0; i<3; i++)
            System.out.println("User: " + name + " " + surname);
    }
}
