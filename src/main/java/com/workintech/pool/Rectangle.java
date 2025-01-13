package com.workintech.pool;

public class Rectangle {
    private double width;   // En
    private double length;  // Boy

    // Constructor - width ve length değerlerini alır, 0'dan küçükse 0'a eşitler
    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // getWidth methodu - width değerini döner
    public double getWidth() {
        return width;
    }

    // getLength methodu - length değerini döner
    public double getLength() {
        return length;
    }

    // getArea methodu - alanı hesaplar (width * length)
    public double getArea() {
        return width * length;
    }
}
