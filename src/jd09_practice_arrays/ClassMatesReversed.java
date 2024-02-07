package jd09_practice_arrays;

import java.util.Arrays;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String[] names = {"Amel Kad", "Tarik Tad", "Almir Hot", "Enis Not", "Yuka Pao", "Malik Dao"};


        String[] reversed = new String[names.length];


        for (int i = names.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = names[i].substring(names[i].indexOf(" ") + 1) + " "
                    + names[i].substring(0, names[i].indexOf(" "));

        }
        System.out.println(Arrays.toString(reversed));
    }
}
