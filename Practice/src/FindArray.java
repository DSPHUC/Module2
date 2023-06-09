import java.util.Scanner;

public class FindArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng:");
        int size = scanner.nextInt();
        String[] arr = new String[size];
        scanner.nextLine();
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập tên học sinh tại vị trí: " + i);
            arr[i] = scanner.nextLine();
            i++;
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Nhập tên học sinh tại vị trí: " + i);
//            arr[i] = scanner.nextLine();
//        }
        System.out.println("\n" + "Mảng arr: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print("\t" + arr[j] + "\t");
        }
        System.out.println("\n" + "Nhập tên cần tìm: ");
        String isFind = scanner.next();
        boolean test = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].equals(isFind)) {
                System.out.println("Tìm thấy" + isFind + " tại vị trí " + j);

                test = true;
                break;
            }

        }
        if (!test) {
            System.out.println("Không tìm thấy");
        }
    }
}
