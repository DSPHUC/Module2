import java.util.Scanner;

public class ReserveElementOfArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[20];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập số của mảng tại vị trí: " + i);
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mảng arr: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        for (int j = 0; j < arr.length/2; j++) {
            int temp=arr[j];
            arr[j]=arr[arr.length-j-1];
            arr[arr.length-j-1]=temp;


        }
        System.out.println("\n"+"Mảng reserve: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
