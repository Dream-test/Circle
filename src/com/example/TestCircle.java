package com.example;

import com.example.circle.Circle;

public class TestCircle {

    private final double EPSILON = 0.00001;

    private boolean compareDouble(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }

    private void testCreateCircle() {
        Circle circle = new Circle(10);
        double radius = circle.getRadius();
        if (compareDouble(radius, 10.0)) {
            System.out.println("testCreateCircle: OK");
        } else {
            System.out.println("testCreateCircle: FAILURE");
        }
    }

    private void testSetRadius() {
        Circle circle = new Circle(1);
        if (!compareDouble(circle.getRadius(), 1)) {
            System.out.println("testSetRadius: FAILURE: expected getRadius() = 1, got " + circle.getRadius());
            return;
        }
        circle.setRadius(2.0);
        if (!compareDouble(circle.getRadius(), 2)) {
            System.out.println("testSetRadius: FAILURE: expected r = 2, got " + circle.getRadius());
            return;
        }
        circle.setRadius(-2.5);
        if (!compareDouble(circle.getRadius(), 0)) {
            System.out.println("testSetRadius: FAILURE: expected r = 2, got " + circle.getRadius());
        }
        else {
            System.out.println("testSetRadius: OK");
        }
    }

    private void testGetArea() {
        Circle circle = new Circle(2);
        if (!compareDouble(circle.getArea(), Math.PI * 4)) {
            System.out.println("testGetArea: FAILURE");
        }
        circle.setRadius(-2.0);
        if (!compareDouble(circle.getArea(), 0)) {
            System.out.println("testGetArea: FAILURE");
        } else {
            System.out.println("testGetArea: OK");
        }
    }

    private void testGetAreaByRadius() {
        Circle circle = new Circle(0);
        if (!compareDouble(circle.getAreaByRadius(2.0), Math.PI * 4)) {
            System.out.println("testGetArea: FAILURE");
        }
        if (!compareDouble(circle.getAreaByRadius(-2.0), 0)) {
            System.out.println("testGetArea: FAILURE");
        } else {
            System.out.println("testGetAreaByRadius: OK");
        }

    }
    public void test() {
        testCreateCircle();
        testSetRadius();
        testGetArea();
        testGetAreaByRadius();
    }
}
