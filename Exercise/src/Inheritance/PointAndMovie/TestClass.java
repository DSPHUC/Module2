package Inheritance.PointAndMovie;

public class TestClass {
    public static void main(String[] args) {
//        Point point=new Point();
//        System.out.println(point);
//        point=new Point(5,5);
//        System.out.println(point);
        MoveablePoint moveablePoint =new MoveablePoint(0,0,2f,3f);
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move().toString());
        System.out.println(moveablePoint.move().move().toString());
        System.out.println(moveablePoint.move().move().move().toString());
        System.out.println(moveablePoint.move().move().move().move().toString());
    }
}
