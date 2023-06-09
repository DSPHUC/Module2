package AbstractClass_And_Interface.InterFace_Assignment_GeometryClass.Comparable;

public class Rectangle extends Shape{
    private  double width = 1.0;
    private  double length = 1.0;
    public Rectangle(){
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
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
    public double getArea(){
        return width*this.length;
    }
    public  double getPerimeter(){
        return 2*(width*this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+getWidth()+" and length="+getLength()+", which is a subclass of "+super.toString();
    }

    public static class Circle extends Shape {
        private double radius = 1.0;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius=radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius=radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        @Override
        public String toString() {
            return " A Circle with radius" + getRadius() + ", which is a subclass of " + super.toString();
        }
    }
}
