package jd04_practice;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 200;
        int b = 1;
        int c = 17;

        if ((a>b && a>c && b>c))
            System.out.println(b + " is the median number");
        else if ((b>a && b>c && a>c)) {
            System.out.println(a + " is the median number");
        } else if ((c>a && c>b && b>a)) {
            System.out.println(b + " is the median number");
        }else
            System.out.println("Invalid");

    }
}
