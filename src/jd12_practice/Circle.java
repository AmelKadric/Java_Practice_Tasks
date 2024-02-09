package jd12_practice;

import java.rmi.ServerError;

public class Circle {

    private double radius;
    public static final double PI = 3.14;


    public double getRadius(){
        if(radius <= 0){
            System.err.println("Invalid");
            System.exit(1);
        }
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public double calArea(){
        return radius*radius*PI;
    }

    public double calPerimeter(){
        return radius*2*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}

/*
1. Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the
		 object is printed.

	Create another class named CircleClients, create multiple circle objects,
	 and test each function of the circle object.
 */