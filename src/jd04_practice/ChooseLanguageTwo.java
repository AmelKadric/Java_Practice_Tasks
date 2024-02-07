package jd04_practice;

public class ChooseLanguageTwo {

    public static void main(String[] args) {

        int num = 1;

        switch (num){
            case 1 -> System.out.println("Hello, thanks for the call");
            case 2 -> System.out.println("Hola, gracias por llamar");
            case 3 -> System.out.println("merhaba, aradiginiz icin tesekkurler");
            case 4 -> System.out.println("Merci, pour votre appel");
            default -> System.out.println("invalid");

        }

    }
}
