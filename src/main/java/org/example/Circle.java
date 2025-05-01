package org.example;


public class Circle implements Shape {

    private final double radius;


    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double calculateArea() {
      return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

}