import java.util.Scanner;

public class ConverTemperature {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        double fahrenheit;
        double celsius;
        while (choice != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1. F sang C");
            System.out.println("2. C sang F");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. F sang C");
                    System.out.println("Nhập độ F");
                    fahrenheit = scanner.nextDouble();
                    celsius = (5.0 / 9) * (fahrenheit - 32);
                    System.out.println(celsius);
                    break;
                case 2:
                    System.out.println("2. C sang F");
                    System.out.println("Nhập độ C");
                    celsius = scanner.nextDouble();
                    fahrenheit = celsius * 9 / 5 + 32;
                    System.out.println(fahrenheit);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không lựa chọn");
            }
        }
    }


}
