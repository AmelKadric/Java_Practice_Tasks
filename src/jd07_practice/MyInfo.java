package jd07_practice;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age");
        int age = input.nextInt();

        System.out.println("Enter gender");
        String gender = input.next();

        input.nextLine();

        System.out.println("Enter full name");
        String fullName = input.nextLine();

        System.out.println("Enter phone number");
        long phoneNumber = input.nextLong();

        System.out.println("Enter zipcode");
        int zipCode = input.nextInt();

        System.out.println("Enter School name");
        String schoolName = input.next();

        input.nextLine();

        System.out.println("Enter city name");
        String cityName = input.next();

        System.out.println("Enter state name");
        String stateName = input.next();

        System.out.println("Enter building number");
        int buildingNumber = input.nextInt();

        System.out.println("Enter street name");
        String streetName = input.next();


        System.out.println(fullName + "\n" + age + "\n" + gender + "\n" + phoneNumber + "\nAddress:" + "\n\t"
                + buildingNumber + " " + streetName + "\n\t" + cityName + ", " + stateName + " " + zipCode );


    }
}
