package jd10_practice;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        String letters = "",
                digits = "",
                specialCharacters = "";

        for (char each : str.toCharArray()){
            if (Character.isDigit(each)){
                digits += each;
            } else if (Character.isLetter(each)) {
                letters += each;
            }else {
                specialCharacters += each;
            }
        }



        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacters = " + specialCharacters);

    }


}
