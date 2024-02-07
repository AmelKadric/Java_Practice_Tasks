package jd04_practice;

import java.lang.invoke.SwitchPoint;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int totalPeople = 75;

        if (totalPeople == 50){
            System.out.println("20 crew, 50 passengers");
        } else if (totalPeople == 75) {
            System.out.println("25 crew, 50 passengers");
        } else if (totalPeople == 100) {
            System.out.println("30 crew, 70 passengers");
        }else
            System.out.println("Invalid Option");

    }

}
