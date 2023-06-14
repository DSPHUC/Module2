import java.util.Scanner;

public class GreateCommonFactor {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập a:");
        int a =Math.abs(scanner.nextInt()) ;
        System.out.println("Nhập b:");
        int b = Math.abs(scanner.nextInt());
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung");
        }
        while (a!=b){
            if (a>b)
                a = a-b;
            else
                b = b - a;


        } System.out.println("Ước chung lớn nhất là: " + a);
    }
}