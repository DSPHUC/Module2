package AbstractClass_And_Interface.InterFace_Assignment_GeometryClass.Comparable;


public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3,5);
        System.out.println(rectangle);
        rectangle = new Rectangle(5,7,"green",true);
        System.out.println(rectangle);
    }
}
