import java.util.Scanner;
import java.util.Arrays;

public class AddElementArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng:");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int k = 0; k < arr.length; k++) {
            System.out.println("Nhập số cần thêm");
            int x = scanner.nextInt();
            System.out.println("Nhập vị trí cần thêm");
            int index = scanner.nextInt();
            if (index > 0 && index < arr.length) {
                for (int i = arr.length - 1; i > index; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[index] = x;
                for (int element : arr) {
                    System.out.print(element + "\t");
                }
            }
        }
    }
}





