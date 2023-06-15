package Inheritance.TriangleOfShape;

import java.util.Scanner;

public class TestTriangle {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập màu:");
        String color = scanner.nextLine();
        System.out.println("Nhập side 1");
        Double side1 = scanner.nextDouble();
        System.out.println("Nhập side 2");
        Double side2 = scanner.nextDouble();
        System.out.println("Nhập side 3");
        Double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(color, side1, side2, side3);

        System.out.println(triangle);

    }
}
