package com.iwona.cat;

public class Cat {
    String name;
    public Cat (String name) {
        this.name = name;
    }
    public String getName () { return name; }
    public void setName(String name) { this.name = name; }
    void display () {
        System.out.println("We have the cat " + name + ".");
    }
    void informUs () {
        System.out.println("Meu, meu, meu ... " + name + " informed us, he is hungry. ");
    }
    void eat () {
        System.out.println(name + " is eating milk and mouse. ");
    }
    void sleep () {
        System.out.println(name + " is not hungry now. ");
        System.out.println(name + " is going to sleep for 5 hours. ");
    }
    void play () {
        System.out.println(name + " is playing around with ball. ");
    }
}

