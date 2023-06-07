import java.util.Scanner;

public class BodyIndex {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double weight;
        System.out.println("Nhập cân nặng:");
        weight = scanner.nextDouble();
        double height;
        System.out.println("Nhập chiều cao:");
        height = scanner.nextDouble();
        double bmi =( weight / (height * height));
        System.out.println(bmi);
        // int bni = weight / Math.pow(height,2);
        switch (bmi < 18.5 ? 0 : 18.5 < bmi & bmi < 25.0 ? 1 : 25.0 < bmi & bmi < 30.0 ? 2 : 3) {
            case 0:
                System.out.println("Underweight" + bmi);
                break;
            case 1:
                System.out.println("Normal" + bmi);
                break;
            case 2:
                System.out.println("Overweight" + bmi);
                break;
            default:System.out.println("Obese" + bmi);

        }
    }
}

