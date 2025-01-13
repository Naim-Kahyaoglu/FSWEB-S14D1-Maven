package com.workintech.cylinder;  // If you're keeping Cylinder in the same package.

public class Cylinder extends Circle {
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius);  // Calling the parent class constructor (Circle) to set radius
        // Ensure height is not negative
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Method to calculate and return the volume of the cylinder
    public double getVolume() {
        return getArea() * height;  // Volume = Area of base * height
    }
}
