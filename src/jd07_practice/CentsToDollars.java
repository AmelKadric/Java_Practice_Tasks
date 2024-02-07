package jd07_practice;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of cents ");
        int cents = input.nextInt();
        input.close();

        int remainder = cents % 100;
        int dollars = cents / 100;

        System.out.println(cents + " cents is equal to " + dollars + " dollar(s) and " + remainder + " cents ");





    }


}
