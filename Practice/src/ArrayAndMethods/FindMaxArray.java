import java.util.Scanner;

public class FindMaxArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng:");
        int size = scanner.nextInt();
        int[] arrNumber = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Nhập số tại vị trí: " + i);
            arrNumber[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mảng :");
        for (int j : arrNumber) {
            System.out.print(j + "\t");
        }
        int maxNum = arrNumber[0];
        int count = 0;
        for (int j = 1; j < size; j++) {
            if (maxNum < arrNumber[j]) {
                maxNum = arrNumber[j];
                count = j;
            }
        }
        System.out.println("Số lớn nhất trong mảng là :" + maxNum);
        System.out.println("tại vị trí :" + count);
    }
}
