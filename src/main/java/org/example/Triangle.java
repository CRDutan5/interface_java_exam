package org.example;


public class Triangle implements Shape {

    private final double sideA;
    private final double sideB;
    private final double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException();
        }
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            throw new IllegalArgumentException();
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }


    public double getSideB() {
        return sideB;
    }


    public double getSideC() {
        return sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;

        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
      return sideA + sideB + sideC;
    }

    @Override
    public String getType() {
        if (sideA == sideB && sideB == sideC && sideA == sideC) {
            return "Equilateral Triangle";
        }
        else if (sideA == sideB & (sideA != sideC || sideB != sideC)) {
            return "Isosceles Triangle";
        }
        else {
            return "Scalene Triangle";
        }
    }
}