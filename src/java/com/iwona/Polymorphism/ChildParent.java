package com.iwona.Polymorphism;

import java.util.List;

public class ChildParent {public static void main (String args []) {
    Parent parent = new Parent ();
    Parent childOne = new ChildOne();
    Parent childsecond = new ChildSecond();

    List<Parent> parents = List.of(parent, childOne, childsecond);
    for (Parent p : parents) {
        p.go();
        p.sing();
    }
}
    private static void play (ChildSecond childSecond) {
        childSecond.play();
    }
}
