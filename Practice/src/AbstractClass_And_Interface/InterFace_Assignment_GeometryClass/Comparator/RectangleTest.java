package AbstractClass_And_Interface.InterFace_Assignment_GeometryClass.Comparator;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle =new Rectangle(5,7);
        System.out.println(rectangle);
        rectangle = new Rectangle(2,3, "blue",false);
        System.out.println(rectangle);
    }
}
