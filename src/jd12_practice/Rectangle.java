package jd12_practice;

public class Rectangle {

    private double length;
    private double width;

    public double getLength(){
        if (length <= 0){
            System.err.println("Invalid");
            System.exit(1);
        }
        return length;
    }

    public double getWidth(){
        if (width <= 0){
            System.err.println("Invalid");
            System.exit(1);
        }
        return width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calArea(){
        return length*width;
    }

    public double calPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

/*
2. Create a custom class named Rectangle with the following specifications:

	Attributes:
		width
		length

	Ensure encapsulation for both fields.
		Conditions:
			The width and length cannot be set to negative or zero values.

	Add a constructor that allows the user to set both fields during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the rectangle object.
		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
		toString(): Displays the width, length, area, and perimeter of the rectangle
		 when the object is printed.

	Create another class named RectangleClients, create multiple rectangle objects,
	 and test each function of the rectangle object.
 */