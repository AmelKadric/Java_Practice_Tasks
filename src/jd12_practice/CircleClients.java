package jd12_practice;

public class CircleClients {

    public static void main(String[] args) {

        Circle cir1 = new Circle(10);
        System.out.println(cir1.getRadius());

        cir1.setRadius(3);
        System.out.println(cir1.getRadius());

        cir1.calArea();
        System.out.println(cir1.calArea());

        System.out.println(cir1);


    }


}
