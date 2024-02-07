package jd06_practice;

public class OddAndEven {

    public static void main(String[] args) {

        boolean result = isOdd(100);
        System.out.println(result);
        result = isEven(100);
        System.out.println(result);

    }

    public static boolean isOdd(int num) {

        boolean result;
        if (num % 2 != 0) {
            return result = true;
        } else {
            return result = false;
        }
    }

    public static boolean isEven(int num) {

        boolean result;
        if (num % 2 == 0) {
            return result = true;
        } else {
            return result = false;
        }

    }

}
