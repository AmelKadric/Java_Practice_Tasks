package jd10_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        //  ArrayList<Integer> list2 = new ArrayList<>(list);
        //  System.out.println(list2);

        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(list);




    }

}
