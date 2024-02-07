package jd05_practice;

public class FactorialNumberTwo {

    public static void main(String[] args) {

        int num = 5,
            num2 =1;

        for (int i = num; i >= 1; i--) {
            num2 *= i;

        }
        System.out.println(num2);

    }

}
