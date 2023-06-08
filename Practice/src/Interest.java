import java.util.Scanner;

public class Interest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập tiền cho vay: ");
        int money = scanner.nextInt();
        System.out.println("Nhập số tháng cho vay:");
        int month = scanner.nextInt();
        System.out.println("Nhập lãi suất");
        double rate = scanner.nextDouble();
        int i = 0;
        int interest = 0;
        while (i < month) {
            interest += money * (rate/100/12) * month;
            i++;
        } System.out.println(interest);
    }
}
