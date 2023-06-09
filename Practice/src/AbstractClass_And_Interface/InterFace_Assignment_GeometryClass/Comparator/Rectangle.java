package AbstractClass_And_Interface.InterFace_Assignment_GeometryClass.Comparator;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * this.width;
    }

    public double getPrimeter() {
        return 2 * (width * this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + getWidth() + " and length= " + getLength() + ", which is a subclass of " + super.toString();
    }
}
