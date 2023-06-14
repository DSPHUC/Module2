package AccessModifier;

public class TestAccessModifier {
    public static void main(String[] args) {
        AccessModifier circle1 = new AccessModifier();
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        AccessModifier circle2 = new AccessModifier(3   );
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
    }
}
