import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "abcaabcd";
        char check = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);

            if (check==result ) {
                count++;
            }
        }System.out.println(count);
//        System.out.println("Nhap do dai mang");
//        int size = scanner.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.println("Nhap so cua mang tai vi tri: " + i);
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println("Mang: arr");
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//        System.out.println("Nhap so can xoa");
//        int delete = scanner.nextInt();
//        int[] arrNew = new int[size];
//
////        for (int i = 0; i< size;i++){
////            if(delete !=arr[i]){
////                arrNew[j]=arr[i];
////                j++;
////            }
////        }
//
//        for (int i = 0; i < size; i++) {
//            if (delete == arr[i]) {
//                for (int j = 0;j<arr.length;j++)
//                arr[j] = arr[i];
//
//            }
//            arr[arr.length - 1]=0;
//        }
//        System.out.println("Mang: arrNew");
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//        int[] arr = {5, 4, 6, 9, 0, 0, 0};
////        System.out.println("vi tri can them");
////        int index = scanner.nextInt();
//        int index = 3;
//        if (index >= 0 && index < arr.length) {
//            for ()
//        }

//        for (int i = 0; i < arr.length; i++) {
////            System.out.println("vi tri can them");
//            int index = scanner.nextInt();
//            if (i == index) {
//                    System.out.println("nhap so can them");
//
//                arr[i] = scanner.nextInt();
//            }
//        }
//        for (int i : arr) {
//            System.out.print(i+"\t");
//        }
    }
}
