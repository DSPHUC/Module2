import java.util.Scanner;

public class QuadraticEquationBuild {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the a");
        double a = scanner.nextDouble();
        System.out.println("Enter the b");
        double b = scanner.nextDouble();
        System.out.println("Enter the c");
        double c = scanner.nextDouble();
        QuadraticEquationBuild quadraticEquationBuild = new QuadraticEquationBuild(a, b, c);
        double delta = quadraticEquationBuild.getDiscriminant();
        Double x1 = quadraticEquationBuild.getRoot1();
        Double x2 = quadraticEquationBuild.getRoot2();
        quadraticEquationBuild.display();
        System.out.println(delta);
        if (x1 == null) {
            System.out.println("Equation has no root");
            return;

        }
        if (x2 == null) {
            System.out.println("Equation has no root");
            return;

        }
        if (delta == 0) {
            System.out.println("Equation has duplicate roots: " + x1);
        } else {
            System.out.println("x1= " + x1 + "\t x2= " + x2);
        }


    }

    double a;
    double b;
    double c;

    public QuadraticEquationBuild(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }

    public Double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return null;
        }
        return ((-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a));
    }

    public Double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return null;
        }
        return ((-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a));
    }

    public void display() {
        System.out.printf("%fx^2 + %fx+%f=0 \n", this.a, this.b, this.c);
    }
}
