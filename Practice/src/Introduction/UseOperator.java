
import java.util.Scanner;
public class UseOperator {
    public static void main(String[] args) {
        float height;
        float weight;
        Scanner scanner = new Scanner(System.in);

        System.out.println("height: ");
        height = scanner.nextFloat();
        System.out.println("weight: ");
        weight =scanner.nextFloat();
        float area = height * weight;
        System.out.println("Area: " + area);
    }
}
