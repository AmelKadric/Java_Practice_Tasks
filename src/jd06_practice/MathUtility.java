package jd06_practice;

public class MathUtility {

    public static void main(String[] args) {

        calculate(10, '+', 20);

        calculate(2.5, '*', 3.0);

        square(3);

        cube(9);


    }


    public static char calculate(int num1, char operator, int num2) {

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("0");
        }
        return operator;
    }

    public static char calculate(double num1, char operator, double num2) {

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("0");
        }
        return operator;

    }

    public static int square(int num) {

        return num * num;
    }

    public static double square(double num) {

        return num * num;
    }

    public static int cube(int num) {
        return square(num) * num;
    }

    public static double cube(double num) {
        return square(num) * num;
    }

}

