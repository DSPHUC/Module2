package AbstractClass_And_Interface.InterFace_Assignment_GeometryClass.Comparable;

public class CircleTest {
    public static void main(String[] args) {
        Rectangle.Circle circle = new Rectangle.Circle();
        System.out.println(circle);
        circle = new Rectangle.Circle(4);
        System.out.println(circle);
        circle = new Rectangle.Circle(5,"blue",true);
        System.out.println(circle);
    }
}
