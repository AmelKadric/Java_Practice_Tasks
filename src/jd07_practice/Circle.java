package jd07_practice;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");

        double radius = input.nextInt();

        input.nextLine();

        System.out.println("Area of the circle: " + (3.14 * radius) * radius);
        System.out.println("Perimeter of the cirlce: " + 2 * (3.14 * radius));

        input.close();





    }
}
