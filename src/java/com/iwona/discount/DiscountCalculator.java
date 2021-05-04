package com.iwona.discount;

public class DiscountCalculator {
    private int age;
    private double price;
    private int discount80;
    private int discount25;
    private int discount30;


    public DiscountCalculator(int a, double p, int d80, int d25, int d30) {
        this.age = a;
        this.price = p;
        this.discount80 = d80;
        this.discount25 = d25;
        this.discount30 = d30;
    }
    int getAge() { return age; }
    double getPrice() { return price; }
    int getDiscount80() { return discount80; }
    int getDiscount25() { return discount25;}
    int getDiscount30() { return discount30;}
    void setAge(int age) { this.age = age; }
    void setPrice(double price) { this.price = price; }
    void setDiscount80(int discount80) { this.discount80 = discount80;}
    void setDiscount25(int discount25) { this.discount25 = discount25;}
    void setDiscount30(int discount30) { this.discount30 = discount30; }

    double discountedPrice80() {
        return (double) (this.price - this.price * this.discount80 / 100);}
    double discountedPrice25() {
        return (double) (this.price - this.price * this.discount25 / 100);}
    double discountedPrice30() {
        return (double) (this.price - this.price * this.discount30 / 100);}

    public void displayDiscountedPrice() {
        if (this.age < 6) {
            System.out.printf("%d years is less than 6 years - \n", age);
            System.out.println("the discounted price is: " + discountedPrice80());
        } else if (this.age < 18 && this.age > 6) {
            System.out.printf("%d years is between 6 and 18 years - \n", age);
            System.out.println("the discounted price is: "+ discountedPrice25());
        } else if (this.age > 65) {
            System.out.printf("%d years is more than 65 years - \n", age);
            System.out.println("the discounted price is: "+ discountedPrice30());
        } else {
            System.out.printf("%d years is between 18 and 65 - \n", age);
            System.out.println("No discount");
        }
    }
}


