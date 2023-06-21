import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

//    public static void main(String[] args) {
//        String str = "abcaabcd";
//        char check = 'a';
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char result = str.charAt(i);
//
//            if (check==result ) {
//                count++;
//            }
//        }System.out.println(count);
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
public static void main(String[] args) {
    ArrayList collection1 = new ArrayList();
    collection1.add("New York");
    collection1.add("Atlanta");
    collection1.add("Dallas");
    collection1.add("Madison");
    System.out.println("A list of cities in collection1:");
    System.out.println(collection1);
    System.out.println("\nIs Dallas in collection1: " + collection1.contains(collection1));
    collection1.remove("Dallas");
    System.out.println("\n" + collection1.size() + " cities are in collection1 now"+"\n is city now: "+collection1);
    Collection collection2 = new ArrayList<>();
    collection2.add("Searrle");
    collection2.add("Portland");
    collection2.add("Los Angeles");
    collection2.add("Atlanta");
    System.out.println("\nA list of cities in collection2:");
    System.out.println(collection2);
    ArrayList c1 = (ArrayList) collection1.clone();
    c1.addAll(collection2);
    System.out.println("\nCities in collection1 or collection2:");
    System.out.println(c1);
    c1 = (ArrayList) (collection1.clone());
    c1.removeAll(collection2);
    System.out.println("\nCities in collection1, but not in 2:");
    System.out.println(c1);
}
}
