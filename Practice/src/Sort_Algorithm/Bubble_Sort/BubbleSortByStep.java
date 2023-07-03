package Sort_Algorithm.Bubble_Sort;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng mảng:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập" + list.length + "giá trị");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Danh sách đầu vào");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBắt đầu xử lý sắp xếp...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                System.out.println("Swap "+list[i]+" with "+list[i+1]);
                if (list[i] > list[i + 1]) {
                    swap(list, i);
                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Mảng có thể được sắp xếp và không cần vượt qua tiếp theo");

                break;
            }
            System.out.println("Liệt kê sau " + k + " sort: ");
            for (int i : list) {
                System.out.println(i + "\t");
            }
            System.out.println();
        }
    }

    public static void swap(int[] list, int i) {
        int temp = list[i];
        list[i] = list[i+1];
        list[i+1] = temp;
    }
}
