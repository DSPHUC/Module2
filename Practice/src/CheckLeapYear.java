import java.util.Scanner;

public class CheckLeapYear {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập năm: ");
        int year;
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm nhuận");
                } else {
                    System.out.println("Năm không nhuận");
                }
            } else {
                System.out.println("Năm nhuận");
            }
        } else {
            System.out.println("Năm không nhuận");

        }
    }
}
