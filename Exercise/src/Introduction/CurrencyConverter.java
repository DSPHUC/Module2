import java.util.Scanner;

public class CurrencyConverter {
    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD ");
        USD = scanner.nextDouble();
        double currency = USD*VND;
        System.out.println(currency);
    }
}

