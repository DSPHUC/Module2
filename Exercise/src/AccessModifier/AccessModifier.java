package AccessModifier;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";

    public AccessModifier() {

    }

    public AccessModifier(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

}
