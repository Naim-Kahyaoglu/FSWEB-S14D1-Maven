package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;  // Yükseklik

    // Constructor - width, length ve height parametreleri alır
    public Cuboid(double width, double length, double height) {
        super(width, length); // Rectangle constructor'ını çağırır
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // getHeight methodu - height değerini döner
    public double getHeight() {
        return height;
    }

    // getVolume methodu - hacmi hesaplar (area * height)
    public double getVolume() {
        return getArea() * height; // Rectangle'ın alanını alıp height ile çarpar
    }
}
