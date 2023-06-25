package Stack_Queue.Conversion_Binary;

import java.util.Scanner;

import static Stack_Queue.Conversion_Binary.Decimal_To_Binary.coverD_To_B;

public class Test_D_T_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();
        String result = coverD_To_B(number);
        System.out.println(result);
    }
}
