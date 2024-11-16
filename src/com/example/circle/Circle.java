package com.example.circle;

/**
 * Заполните этот класс в соответсвии с заданием из лекции.
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public double getArea() {
        if (this.radius > 0) {
            return Math.PI*Math.pow(this.radius, 2);
        } else return 0;
    }

    public double getAreaByRadius(double radius) {
        if (radius > 0) {
            return Math.PI * Math.pow(radius, 2);
        }
        return 0;
    }
}
