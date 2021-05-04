package com.iwona.cat;


public class CatTester {
    public static void main(String[] args) {
        Cat tom = new Cat ("Tom");
        System.out.println(tom.getName());
        tom.display();

        tom.informUs();
        tom.eat();
        tom.sleep();
        tom.play();
    }
}
