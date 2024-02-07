package jd09_practice_arrays;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int odds = 0;
        int evens = 0;

        for (int number : numbers) {
            if (number % 2 == 0)
                evens++;
            else {
                odds++;
            }
        }

        System.out.println("The Number of odds: " + odds + "\nThe Number of evens: " + evens);


        /*
        int[] odds;

        for (int i = 0; i < numbers.length +1; i++) {

            if (numbers[i] % 2 != 0)
               odds = new int[numbers.length];

                System.out.println("Odds: " + Arrays.toString(numbers));

            if (numbers[i] % 2 == 0);
            System.out.println("Evens: " + Arrays.toString(numbers));

         */

    }

}

