import java.util.Scanner;

public class FindElementMaxOfArrayInArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số lượng mảng:");
        int x = scanner.nextInt();
        System.out.println("Nhập độ dài mảng:");
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Nhập số của mảng "+i+" tại vị trí "+j);
                 arr[i][j]=scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}
