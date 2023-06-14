import java.util.Scanner;

public class SumDiagonalArrayInArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhập kích thước mảng:");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Nhập số của mảng " + i + " tại vị trí " + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][i];

        }
        System.out.println("TỔng các số của đường chéo là: "+sum);
    }
}

