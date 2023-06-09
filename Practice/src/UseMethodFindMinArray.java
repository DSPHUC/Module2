import java.util.Scanner;

public class UseMethodFindMinArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập số vào mảng tại vị trí: " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng :");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        int index = minValue(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là :" + arr[index]);

    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}

