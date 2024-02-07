package jd04_practice;

public class MedianNumberTwo {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;

        if (a>b && a>c && b>c){
            System.out.println("median number is " + b);
        } else if (b>a && b>c && c>a) {
            System.out.println("median number is " + c);
        } else if (c>a && c>b && a>b) {
            System.out.println("median number is " + a);
        }else {
            System.out.println("invalid");
        }


    }

}
