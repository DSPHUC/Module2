package Inheritance.TriangleOfShape;

import java.util.Scanner;

public class Triangle extends Shape {
    //  Scanner scanner = new Scanner(System.in);
    private double side1;// = scanner.nextDouble();
    private double side2;// = scanner.nextDouble();
    private double side3;//= scanner.nextDouble();

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getAcreage() {
        double half = getPerimeter() / 2;
        return Math.sqrt(half * (half - getSide1()) * (half - getSide2()) * (half - getSide3()));
    }

    @Override
    public String toString() {
        return "A Triangle with  side 1 = " + getSide1() + ", side 2 = " + getSide2()
                + ", side 3 = " + getSide3() + " with Perimeter " + getPerimeter()
                + " with Acreage " + getAcreage() + super.toString();
    }
}
