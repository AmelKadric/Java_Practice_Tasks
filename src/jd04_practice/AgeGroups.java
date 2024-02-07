package jd04_practice;

public class AgeGroups {

    public static void main(String[] args) {

        int age = -9;

        if (age >= 0 && age <= 20){
            System.out.println("Teenager");
        } else if (age >= 21 && age <= 55 ) {
            System.out.println("Adult");
        } else if (age >= 56 && age <= 150 ) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid");

        }

    }
}
