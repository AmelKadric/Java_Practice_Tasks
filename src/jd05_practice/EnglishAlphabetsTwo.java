package jd05_practice;

public class EnglishAlphabetsTwo {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("---------------------");

        for (char j = 'Z'; j >= 'A'; j--) {
            System.out.print(j + " ");
        }

    }
}
