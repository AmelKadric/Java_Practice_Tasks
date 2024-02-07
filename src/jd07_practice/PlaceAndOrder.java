package jd07_practice;

import java.util.Scanner;

public class PlaceAndOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product name");
        String productName = input.next();

        System.out.println("Enter price");
        double price = input.nextDouble();

        System.out.println("Enter quantity");
        int quantity = input.nextInt();

        System.out.println("Enter first name only");
        String firstName = input.next();

        double total = price * quantity;

        input.close();

        System.out.println(firstName + " your order for " + quantity + " " + productName + " has been placed. Your total is " + total);


    }
}
