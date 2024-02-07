package jd04_practice;

public class ChooseLaguage {

    public static void main(String[] args) {

        int selection = 3;

        if (selection == 1){
            System.out.println("Hello, thank you for your call");
        } else if (selection == 2) {
            System.out.println("Hola, gracia por llamar");
        } else if (selection == 3) {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        } else if (selection == 4) {
            System.out.println("Something in Russian");
        } else if (selection == 5) {
            System.out.println("Merci, pour votre appel");
        }else {
            System.out.println("Invalid choice");
        }

    }
}
