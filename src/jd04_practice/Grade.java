package jd04_practice;

public class Grade {

    public static void main(String[] args) {
/*
        char grade = 'B';

        String a = "Excellent",
                b = "Great Job",
                c = "Good",
                d = "Passed",
                f = "Failed";
                is = "Invalid score";


        System.out.println(b);
*/


        char grade = 'B';

        switch (grade){
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Great job");
            case 'C' -> System.out.println("Good");
            case 'D' -> System.out.println("Passed");
            case 'F' -> System.out.println("Failed");

        }



    }
}
