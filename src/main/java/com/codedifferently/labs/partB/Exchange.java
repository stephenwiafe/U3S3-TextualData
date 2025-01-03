package com.codedifferently.labs.partB;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please Select Your Starting Currency:");
        System.out.println("1: Dollar");
        System.out.println("2: Euro");
        System.out.println("3: Pound");
        System.out.println("4: Rupee");
        System.out.println("5: Yen");
        System.out.println("6: Renminbi");
        System.out.print("Type below: ");

        String startingCurrencyCode = inputScanner.next();
        String startingCurrencyName = getCurrencyName(startingCurrencyCode);
        double startingCurrencyRate = getUSDConversionRate(startingCurrencyCode);

        if (startingCurrencyName.equals("Invalid")) {
            System.out.println("Invalid starting currency selection.");
            return;
        }

        System.out.println("Please enter the amount in " + startingCurrencyName + ":");
        double startingCurrencyAmount = inputScanner.nextDouble();
        double amountInUSD = startingCurrencyAmount / startingCurrencyRate;

        System.out.println("Please Select Currency to transfer to:");
        System.out.println("1: Dollar");
        System.out.println("2: Euro");
        System.out.println("3: Pound");
        System.out.println("4: Rupee");
        System.out.println("5: Yen");
        System.out.println("6: Renminbi");
        System.out.print("Type below: ");

        String targetCurrencyCode = inputScanner.next();
        String targetCurrencyName = getCurrencyName(targetCurrencyCode);
        double targetCurrencyRate = getUSDConversionRate(targetCurrencyCode);

        if (targetCurrencyName.equals("Invalid")) {
            System.out.println("Invalid target currency selection.");
            return;
        }

        double convertedCurrencyAmount = amountInUSD * targetCurrencyRate;

        System.out.printf("%.2f %s to %.2f %s%n", startingCurrencyAmount, startingCurrencyName, convertedCurrencyAmount, targetCurrencyName);
    }

    private static String getCurrencyName(String currencyCode) {
        switch (currencyCode) {
            case "1": return "Dollars";
            case "2": return "Euros";
            case "3": return "Pounds";
            case "4": return "Rupees";
            case "5": return "Yens";
            case "6": return "Renminbis";
            default: return "Invalid";
        }
    }

    private static double getUSDConversionRate(String currencyCode) {
        switch (currencyCode) {
            case "1": return 1.00;
            case "2": return 0.94;
            case "3": return 0.82;
            case "4": return 68.32;
            case "5": return 115.84;
            case "6": return 6.92;
            default: return -1;
        }
    }
}