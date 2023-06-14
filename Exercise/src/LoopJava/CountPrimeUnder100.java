import java.util.Scanner;

public class CountPrimeUnder100 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 3;

        System.out.println(2);
        while (number < 100) {
            int count = 0;
            for (int i = 2; i < number; i++)
                if (number % i == 0) {
                    count++;
                }
            if (count == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
