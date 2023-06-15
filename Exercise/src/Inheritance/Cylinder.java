package Inheritance;

public class Cylinder extends Circle {
    private double height;


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return radius * radius * Math.PI * height;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + getRadius() +",which with height "+getHeight()+ " and which with color of " + getColor() ;
    }
}
