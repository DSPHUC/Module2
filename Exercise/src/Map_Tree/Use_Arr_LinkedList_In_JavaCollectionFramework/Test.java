package Map_Tree.Use_Arr_LinkedList_In_JavaCollectionFramework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManagerUseArrayList pm = new ProductManagerUseArrayList();
        ProductManagerUseLinkedList pm2 = new ProductManagerUseLinkedList();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int choice = -1;
        do {
            System.out.println("Quản lý sản phẩm");
            System.out.println("1. Sử dụng ArrayList");
            System.out.println("2. Sử dụng LinkedList");
            System.out.println("0. Dừng");
            System.out.println("Nhập lựa chọn");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
//                    do {
                    System.out.println("Quản lý sản phẩm");
                    System.out.println("1. Thêm sản phẩm");
                    System.out.println("2. Sửa thông tin sản phẩm theo id");
                    System.out.println("3. Xóa sản phẩm theo id");
                    System.out.println("4. Hiển thị danh sách sản phẩm");
                    System.out.println("5. Tìm kiếm sản phẩm theo tên");
                    System.out.println("6. Sắp xếp sản phẩm theo giá tăng dần");
                    System.out.println("7. Sắp xếp sản phẩm theo giá giảm dần");
                    System.out.println("8. Sắp xếp sản phẩm theo thứ tự tự nhiện");
                    System.out.println("9. Sắp xếp sản phẩm theo thứ tự ngược lại");
                    System.out.println("0. Quay lại");
                    System.out.println("Nhập lựa chọn");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            sc.nextLine();
                            System.out.println("Nhập tên sản phẩm: ");
                            String name = sc.nextLine();
                            System.out.println("Nhập giá sản phẩm: ");
                            double price = sc.nextDouble();
                            Product product = new Product(name, price);
                            pm.addProduct(product);
                            break;
                        case 2:
                            System.out.println("Nhập id sản phẩm cần sửa: ");
                            int idEdit = sc.nextInt();
                            pm.editProduct(idEdit);
                            break;
                        case 3:
                            System.out.println("Nhập id sản phẩm cần xóa: ");
                            int idDelete = sc.nextInt();
                            pm.deleteProduct(idDelete);
                            break;
                        case 4:
                            pm.displayProducts();
                            break;
                        case 5:
                            sc.nextLine();
                            System.out.println("Nhập tên cần tìm: ");
                            String nameSeach = sc.nextLine();
                            pm.searchProduct(nameSeach);
                            break;
                        case 6:
                            sc.nextLine();
                            pm.sortProductsByPrice(1);
                            break;
                        case 7:
                            sc.nextLine();
                            pm.sortProductsByPrice(2);
                            break;
                        case 8:
                            sc.nextLine();
                            pm.sortProductsByName(1);
                            break;
                        case 9:
                            sc.nextLine();
                            pm.sortProductsByName(2);
                            break;
                        case 0:
                            exit = false;
                            break;
                    }
                    break;
                case 2:
//                    do {
                    System.out.println("Quản lý sản phẩm");
                    System.out.println("1. Thêm sản phẩm");
                    System.out.println("2. Sửa thông tin sản phẩm theo id");
                    System.out.println("3. Xóa sản phẩm theo id");
                    System.out.println("4. Hiển thị danh sách sản phẩm");
                    System.out.println("5. Tìm kiếm sản phẩm theo tên");
                    System.out.println("6. Sắp xếp sản phẩm theo giá tăng dần");
                    System.out.println("7. Sắp xếp sản phẩm theo giá giảm dần");
                    System.out.println("8. Sắp xếp sản phẩm theo thứ tự tự nhiện");
                    System.out.println("9. Sắp xếp sản phẩm theo thứ tự ngược lại");
                    System.out.println("0. Quay lại");
                    System.out.println("Nhập lựa chọn");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            sc.nextLine();
                            System.out.println("Nhập tên sản phẩm: ");
                            String name = sc.nextLine();
                            System.out.println("Nhập giá sản phẩm: ");
                            double price = sc.nextDouble();
                            Product product = new Product(/*id,*/name, price);
                            pm2.addProduct2(product);
                            break;
                        case 2:
                            System.out.println("Nhập id sản phẩm cần sửa: ");
                            int idEdit = sc.nextInt();
                            pm2.editProduct2(idEdit);
                            break;
                        case 3:
                            System.out.println("Nhập id sản phẩm cần xóa: ");
                            int idDelete = sc.nextInt();
                            pm2.deleteProduct2(idDelete);
                            break;
                        case 4:
                            pm2.displayProducts2();
                            break;
                        case 5:
                            sc.nextLine();
                            System.out.println("Nhập tên cần tìm: ");
                            String nameSeach = sc.nextLine();
                            pm2.searchProduct2(nameSeach);
                            break;
                        case 6:
                            sc.nextLine();
                            pm2.sortProductsByPrice2(1);
                            break;
                        case 7:
                            sc.nextLine();
                            pm2.sortProductsByPrice2(2);
                            break;
                        case 8:
                            sc.nextLine();
                            pm2.sortProductsByName2(1);
                            break;
                        case 9:
                            sc.nextLine();
                            pm2.sortProductsByName2(2);
                            break;
                        case 0:
                            exit = false;
                            break;
                    }
                    break;
                case 0:
                    exit = true;
                    break;
            }


        } while (!exit);
    }
}