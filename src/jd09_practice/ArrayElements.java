package jd09_practice;

public class ArrayElements {

    public static void main(String[] args) {

        int[] number = new int[100];

        for (int i = 0; i < number.length+1; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int j = number.length; j >= 0; j--) {
            System.out.print(j + " ");
        }

        System.out.println();

        for (int k = 0; k < number.length; k++) {
           if (k % 5 == 0){
               System.out.print(k + " ");
           }

        }

    }

}

/*
1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
 */