package com.iwona.discount;

public class DiscountCalculatorTest {
    public static void main(String[] args) {

        DiscountCalculator customer = new DiscountCalculator(15, 10, 80, 25, 30);

        customer.displayDiscountedPrice();
    }
}
