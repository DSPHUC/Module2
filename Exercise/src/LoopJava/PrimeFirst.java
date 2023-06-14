import java.util.Scanner;

public class PrimeFirst {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 1;
        System.out.println(2);
        for (int i = 2; count < 20; i++ ) {

            if (i % 2 != 0) {
                count++;
                System.out.println(i);

            }
        }
    }
}
