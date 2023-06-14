import java.util.Scanner;

public class CountNumberPass {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        int[] arr;
        do {
            System.out.println("Nhập size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Không hợp lệ");
            }
        } while (size > 30);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập điểm của học sinh " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("danh sách điểm:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10) {
                count++;
            }

        } System.out.println("\n"+"Số lượng học sinh đạt là:" + count);
    }
}
