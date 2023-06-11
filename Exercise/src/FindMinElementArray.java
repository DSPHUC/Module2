import java.util.Scanner;
public class FindMinElementArray {
    public static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số lượng mảng:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập số của mảng tại vị trí "+i);
            arr[i]=scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 1 ; i<size;i++){
            if(min>arr[i]){
                min= arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là:"+min) ;
    }
}
