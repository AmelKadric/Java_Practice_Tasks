package jd08_practice;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word:");
        String firstWord = input.nextLine();

        System.out.println("Enter your second word:");
        String secondWord = input.nextLine();

        System.out.println(firstWord.substring(1) + secondWord.substring(1));

        input.close();


    }
}