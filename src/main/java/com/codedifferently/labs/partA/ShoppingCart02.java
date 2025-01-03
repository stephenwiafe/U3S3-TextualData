package com.codedifferently.labs.partA;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";

        double price = 25.00;
        double tax = 0.08;
        int quantity = 3;

        double totalPrice = (price * quantity) * (1 + tax);

        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        System.out.println(message);
        System.out.printf("Total cost with tax is: $%.2f%n", totalPrice);
    }
}
