package jd08_practice;

public class StartsWithX {

    public static void main(String[] args) {

        String str = "xcodex";

        char s1 = str.charAt(0);

        if (s1 == 'x'){
            str = str.replaceFirst("x", "a");
            System.out.println(str);
        }



    }
}

/*
1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex

 */