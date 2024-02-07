package jd05_practice;

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 5;
        int multiple = 1;

        for (int i = num; i >= 1 ; i--) {
            multiple *= i;
            
        }
        System.out.println(multiple);


    }
}
