package AbstractAndInterface.Resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "red", false);
        shapes[1] = new Square(x, "blue", false);
        shapes[2] = new Rectangle(x, x, "orange", true);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        for (Shape shape : shapes) {
            shape.resize(Math.random() * 1000);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
