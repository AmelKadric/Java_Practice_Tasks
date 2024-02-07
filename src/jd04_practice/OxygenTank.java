package jd04_practice;

public class OxygenTank {

    public static void main(String[] args) {

        String oxygenLevel = "Above 90";

        switch (oxygenLevel) {
            case "Above 90" -> System.out.println("Your tank is full");
            case "Above 80" -> System.out.println("Still okay");
            case "Above 70" -> System.out.println("Dont go too far");
            case "Above 60" -> System.out.println("Start to head back");
            case "Above 50" -> System.out.println("Be careful, you're at %50");

        }



    }
}
