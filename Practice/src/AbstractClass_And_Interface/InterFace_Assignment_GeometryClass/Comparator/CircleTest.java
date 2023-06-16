package AbstractClass_And_Interface.InterFace_Assignment_GeometryClass.Comparator;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(5);
        System.out.println(circle);
        circle=new Circle(5,"Black",false);
        System.out.println(circle);
    }
}
