package jd04_practice;

public class Finra {

    public static void main(String[] args) {

        int number = 15;

        if (number % 3 == 0) {
            System.out.println("FIN");
        } if (number % 5 == 0) {
            System.out.println("RA");
        } if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FINRA");
        }else {
            System.out.println("Neither number is divisible by 3 or 5");
        }

    }
}
