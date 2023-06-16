package AbstractClass_And_Interface.InterFace_Assignment_GeometryClass.Resizeable;

public class Rectangle extends Shape {
    private double width;
    private double length;

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
        return this.length * this.width;
    }

    public double getPrimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "A rectangle with width= " + getWidth() + ", with length= " + getLength() + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.length *= (percent / 200);
        this.width += (percent / 200);

    }

}
