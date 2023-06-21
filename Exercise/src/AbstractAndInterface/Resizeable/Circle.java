package AbstractAndInterface.Resizeable;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPrimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "+getRadius()+", with area= "+getArea()+", with primeter= "+getPrimeter()+super.toString();
    }
    @Override
    public void resize(double percent){
        this.radius *= (percent/200);
    }
}
