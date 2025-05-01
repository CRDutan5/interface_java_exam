package org.example;


public class Rectangle implements Shape {

    private final double width;
    private final double height;


    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException();
        }

        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return this.width;
    }


    public double getHeight() {
        return this.height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width * 2) + (height * 2);
    }

    @Override
    public String getType() {
        if (width == height) {
            return "Square";
        }
        return "Rectangle";
    }
}