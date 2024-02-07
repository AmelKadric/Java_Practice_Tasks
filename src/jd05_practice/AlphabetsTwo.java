package jd05_practice;

public class AlphabetsTwo {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'D'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                System.out.print(i);
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }

}
