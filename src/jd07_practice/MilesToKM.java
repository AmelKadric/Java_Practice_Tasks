package jd07_practice;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Miles");
        int miles = input.nextInt();

        input.close();

        double km = miles * 1.60934;

        System.out.println(miles + " miles is equal to " + km + " Kilometers ");

    }
}
