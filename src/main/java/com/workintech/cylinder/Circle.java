package com.workintech.cylinder;  // If you're keeping Circle in the same package.

public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        // Ensure radius is not negative
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;  // Correct area calculation
    }
}
