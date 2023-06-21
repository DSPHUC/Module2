package AbstractAndInterface.Resizeable;

public class Square extends Shape {
    private double side;

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPrimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "A Square with side= " + getSide() + ", with area=" + getArea()
                + ", with primeter=" + getPrimeter() + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side +=(percent/200);
    }
}
