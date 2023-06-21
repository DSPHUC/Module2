package AbstractAndInterface.Colorable;

public class ColoraableTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[20];
        for (int i = 0; i < 20; i++) {
            shape[i] = getRandomShape();
        }
        Shape.printShape(shape);
        for (Shape x : shape) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();
            }
        }
    }

    static Shape getRandomShape() {
        int radom = (int) (Math.round(Math.random() * 2));
        switch (radom) {
            case 0:
                return new Square(20,"red",false);
            case 1:
                return new Rectangle(10, 20,"blue",true);
            default:
                return new Circle(10,"yelow",true);
        }
    }

}
