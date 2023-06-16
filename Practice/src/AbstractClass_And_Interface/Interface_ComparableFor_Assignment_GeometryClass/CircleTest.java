package AbstractClass_And_Interface.Interface_ComparableFor_Assignment_GeometryClass;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(4);
        System.out.println(circle);
        circle = new Circle(5,"red",true);
        System.out.println(circle);
    }
}
