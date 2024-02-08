package jd10_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {


        String [] arr1 = { "A","B","C" };
        String [] arr2 = { "D","E","F","G" };

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        for (String each : arr1) {
            list.add(each);
        }
        for (String each2 : arr2) {
            list.add(each2);
        }

        System.out.println(list);

    }

}
