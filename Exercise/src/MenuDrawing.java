import java.util.Scanner;

public class MenuDrawing {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Hình vuông");
            System.out.println("2. Hình chữ nhật");
            System.out.println("3. Hình tam giác");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            int length;
            switch (choice) {
                case 1:
                    System.out.println("Hình vuông");
                    System.out.println("Nhập cạnh hình vuông");
                    length = scanner.nextInt();
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Hình chữ nhật");
                    System.out.println("Nhập chiều dài");
                    length = scanner.nextInt();
                    System.out.println("Nhập chiều rộng");
                    int width = scanner.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int choice2 = -1;
                    while (choice2 != 0) {

                        System.out.println("Menu");
                        System.out.println("1. Tam giác vuông (trên trái)");
                        System.out.println("2. Tam giác vuông (trên phải)");
                        System.out.println("3. Tam giác vuông (dưới trái)");
                        System.out.println("4. Tam giác vuông (dưới phải)");
                        System.out.println("5. Tam giác cân");
                        System.out.println("0. Exit");
                        System.out.println("Nhập lựa chọn: ");
                        choice2 = scanner.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("Tam giác vuông (trên trái)");
                                System.out.println("Nhập chiều dài");
                                length = scanner.nextInt();
                                for (int i = length; i >= 1; i--) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print(" *");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                System.out.println("Tam giác vuông (trên phải)");
                                System.out.println("Nhập chiều dài");
                                length = scanner.nextInt();
                                for (int i = 0; i <= length; i++) {
                                    for (int k = 0; k <= i; k++) {
                                        System.out.print("  ");
                                    }
                                    for (int j = 0; j <= length - i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                System.out.println("Tam giác vuông (dưới trái)");
                                System.out.println("Nhập chiều dài");
                                length = scanner.nextInt();
                                for (int i = 0; i < length; i++) {
                                    for (int j = 0; j <= i; j++) {
                                        System.out.print(" *");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4:
                                System.out.println("Tam giác vuông (dưới phải)");
                                System.out.println("Nhập chiều dài");
                                length = scanner.nextInt();
                                for (int i = 0; i < length; i++) {
                                    for (int j = length - i; j >= 0; j--) {
                                        System.out.print("  ");
                                    }
                                    for (int k = 0; k <= i; k++) {
                                        System.out.print(" *");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 5:
                                System.out.println("Tam giác cân");
                                System.out.println("Nhập chiều dài");
                                length = scanner.nextInt();
                                for (int i = 0; i < length; i++) {
                                    for (int k = 0; k < i; k++) {
                                        System.out.print(" ");
                                    }
                                    for (int j = 0; j < length - i; j++) {
                                        System.out.print(" *");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 0:
                                System.exit(0);
                            default:
                                System.out.println("Không lựa chọn");
                        }
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không lựa chọn");
            }
        }
    }
}
