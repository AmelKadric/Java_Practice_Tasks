package jd14_practice;

import java.util.concurrent.Callable;

public class CarClient {

    public static void main(String[] args) {


        Car car1 = new Toyota("Toyota","Camry",2024,10_000,"Black");
        car1.start();
        car1.drive();
       // System.out.println(car1);

        Car car2 = new Honda("Honda", "Civic", 2010,14_000,"Red");
        car2.start();
        car2.drive();
       // System.out.println(car2);

    }


}
