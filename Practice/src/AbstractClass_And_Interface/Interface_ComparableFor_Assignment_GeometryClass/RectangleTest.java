package AbstractClass_And_Interface.Interface_ComparableFor_Assignment_GeometryClass;

import Inheritance.Rectangle;

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
