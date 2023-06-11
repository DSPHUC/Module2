import java.util.Scanner;

public class MergeArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng arr1:");
        int size1 = scanner.nextInt();

        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Nhập số của mảng tại vị trí: " + i);
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhập độ dài mảng arr2:");
        int size2 = scanner.nextInt();

        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Nhập số của mảng tại vị trí: " + i);
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int j = 0; j < arr1.length; j++) {
            arr3[j] = arr1[j];
        }
        for (int k = 0; k < arr2.length; k++) {
            arr3[arr1.length + k] = arr2[k];
        }
        for (int i : arr3) {
            System.out.print(i + "\t");
        }
    }
}
