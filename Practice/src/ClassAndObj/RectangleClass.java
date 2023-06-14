import java.util.Scanner;
public class RectangleClass {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the width");
        double width = scanner.nextDouble();
        System.out.println("Enter the height");
        double height = scanner.nextDouble();
        RectangleClass rectangleClass = new RectangleClass(width, height);
        System.out.println("Your ReactangleClass \n" + rectangleClass.display());
        System.out.println("Perimeter of the RectangleClass: " + rectangleClass.getPerimeter());
        System.out.println("Area of the RectangleClass: " + rectangleClass.getArea());
    }

        double width;
        double height;

    public RectangleClass(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "RectangleClass{" + "width=" + width + ", height=" + height + "}";
    }
}




