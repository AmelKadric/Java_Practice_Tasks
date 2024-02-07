package jd05_practice;

public class FinraTwo {

    public static void main(String[] args) {

        int num1 = 1,
                num2 = 100;

        do {
            if (num1 % 3 == 0 && num1 % 5 == 0) {
                System.out.print("FINRA ");
            } else if (num1 % 3 == 0) {
                System.out.print("FIN ");
            } else if (num1 % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(num1 + " ");
            }

            num1++;

        } while (num1 <= num2);


    }
}
