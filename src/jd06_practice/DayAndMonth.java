package jd06_practice;

public class DayAndMonth {

    public static void main(String[] args) {


    }


    public static void day(int dayNumber) {
        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println((dayNumber == 1) ? "Monday" : (dayNumber == 2) ? "Tuesday" :
                    (dayNumber == 3) ? "Wednesday" : (dayNumber == 4) ? "Thursday" :
                            (dayNumber == 5) ? " Friday" : (dayNumber == 6) ? "Saturday" : "Sunday");
        } else {
            System.out.println("Invalid Number");
        }

    }

    public static void monthName(int number) {

        String result = switch (number) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Input";
        };
        System.out.println(result);
    }

    public static void daysInMonth(int month) {

        switch (month) {
            case 2:
                System.out.println("28 days");
            break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
            break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

}