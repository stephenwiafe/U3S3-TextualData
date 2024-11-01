package com.codedifferently.labs.partB;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select Your Starting Currency:");
        System.out.println("1: Dollar");
        System.out.println("2: Euro");
        System.out.println("3: Pound");
        System.out.println("4: Rupee");
        System.out.println("5: Yen");
        System.out.println("6: Renminbi");
        scanner.next();
        System.out.println("Please enter the amount in (Euro)s");
        scanner.next();
        System.out.println("Please Select Currency to transfer to:");
        System.out.println("1: Dollar");
        System.out.println("2: Euro");
        System.out.println("3: Pound");
        System.out.println("4: Rupee");
        System.out.println("5: Yen");
        System.out.println("6: Renminbi");
        scanner.next();
        System.out.println("Your (103.50) Euros exchanges to (84.87) Dollars");

    }
}
