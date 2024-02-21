package jd14_practice;

public class Toyota extends Car {

    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getModel() + " is starting");

    }

    @Override
    public void drive() {
        System.out.println(getModel() + " is driving");
    }
}
