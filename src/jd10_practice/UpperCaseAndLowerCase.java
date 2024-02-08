package jd10_practice;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

       String str = "JAVA java";

       int upperCase = 0;
       int lowerCase = 0;

       for(char C1 : str.toCharArray()){

           if (Character.isUpperCase(C1)){
               upperCase ++;
           } else if (Character.isLowerCase(C1)) {
               lowerCase ++;
           }
       }

        System.out.println(upperCase == lowerCase);

    }

}
