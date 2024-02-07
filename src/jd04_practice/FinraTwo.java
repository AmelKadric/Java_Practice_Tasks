package jd04_practice;

public class FinraTwo {

    public static void main(String[] args) {

        int num = 15;

        if (num % 3 == 0){
            System.out.println("Fin");
        } else if (num % 5 == 0) {
            System.out.println("RA");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FINRA");
        }else {
            System.out.println("neither number is divisible");
        }

    }

}
