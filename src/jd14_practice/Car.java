package jd14_practice;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;


    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getMake() {
        if (make == null || make.isEmpty() || make.isBlank()) {
            System.err.println("Invalid");
            System.exit(1);
        }
        return make;
    }

    public String getModel() {
        if (make == null || make.isEmpty() || make.isBlank()) {
            System.err.println("Invalid");
            System.exit(1);
        }
        return model;
    }

    public int getYear() {

        if (year < 1886) {
            System.err.println("invalid");
        }
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price < 0) {
            System.err.println("invalid");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (make == null || make.isEmpty() || make.isBlank()) {
            System.err.println("Invalid");
            System.exit(1);
        }
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println(make + " is stopping");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
