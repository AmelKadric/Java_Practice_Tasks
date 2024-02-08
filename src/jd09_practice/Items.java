package jd09_practice;

import java.util.Arrays;

public class Items {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};


        System.out.println();
        System.out.println(Arrays.toString(items).contains(("iPad")));

                System.out.println("---------------------------------------------------");

        System.out.println((items[0] + " - " + prices[0] + " - #" + itemIDs[0]));
        System.out.println((items[1] + " - " + prices[1] + " - #" + itemIDs[1]));
        System.out.println((items[2] + " - " + prices[2] + " - #" + itemIDs[2]));
        System.out.println((items[3] + " - " + prices[3] + " - #" + itemIDs[3]));
        System.out.println((items[4] + " - " + prices[4] + " - #" + itemIDs[4]));
        System.out.println((items[5] + " - " + prices[5] + " - #" + itemIDs[5]));






    }


}

