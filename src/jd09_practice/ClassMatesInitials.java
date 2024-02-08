package jd09_practice;

import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classmates = {"Amel bih", "Paul ukr", "Windia ind", "Adam pal", "Jamal pal"};
        String[] initials = findInitials(classmates);

        System.out.println(Arrays.toString(classmates));
        System.out.println(Arrays.toString(initials));
    }

    public static String[] findInitials(String[]names){

        String[] initials = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            initials[i] = names[i].charAt(0) + "." + names[i].charAt(names[i].indexOf(" ") +1);
        }

        return initials;

    }

}

/*
Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */