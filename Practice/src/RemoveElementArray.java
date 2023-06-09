import java.util.Scanner;

public class RemoveElementArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập số của mảng tại ví trí " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        int index_del = RemoveElement(arr);
    }
    public static int RemoveElement(int[] array) {
        int[] arrNew = new int[array.length];
        System.out.println("Nhập số cần xóa khỏi mảng: ");
        int index_del = scanner.nextInt();
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (index_del != array[i]) {
                arrNew[j] = array[i];
                j++;
            }
        }
        System.out.println("Mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(arrNew[i] + "\t");
        }
        return index_del;
    }
}