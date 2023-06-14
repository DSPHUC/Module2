import java.util.Scanner;

public class CountOfCharInString {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi kí tự");
        String str = scanner.nextLine();
        System.out.println("Nhập kí tự cần đếm trong chuỗi");
        String check =scanner.next();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);
            if (check.equals(String.valueOf(result))) {
                count += 1;
            }
        }
        System.out.println("Tổng số lần xất hiện của kí tự " + check + " là :"+ count);
    }
}
