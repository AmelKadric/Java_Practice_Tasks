package jd04_practice;

public class GradeLevelTwo {

    public static void main(String[] args) {

        byte gradeLevel = 1;

        if (gradeLevel >= 1 && gradeLevel <= 5) {
            System.out.println("elemantary");
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            System.out.println("middle");
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            System.out.println("High schoo;");
        } else if (gradeLevel >= 13 && gradeLevel <= 16) {
            System.out.println("college");
        } else if (gradeLevel >= 17 && gradeLevel <= 18) {
            System.out.println("grad ");
        }else {
            System.out.println("invalid");
        }
    }
}
