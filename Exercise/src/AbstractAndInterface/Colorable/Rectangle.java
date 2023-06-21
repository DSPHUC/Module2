package AbstractAndInterface.Colorable;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPrimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString() {
        return "A rectangle with length= " + getLength() + ", with width= " + getWidth()
                + ", with area= " + getArea() + ", with primeter= " + getPrimeter()
                + super.toString();
    }
}
