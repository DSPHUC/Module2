import java.util.Scanner;

public class CheckPrimes {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số: ");
        int number = scanner.nextInt();
        int i = 2;
        int count = 0;
        if (number < 2) {
            System.out.println("Không phải số nguyên tố");

        } else {
            while (i < number) {
                if (number % i == 0) {
                    count += 1;


                }
                i++;
            }
            if (count == 0) {
                System.out.println("Là số nguyên tố");

            } else {
                System.out.println("Không phải số nguyên tố");
            }
        }
    }
}


