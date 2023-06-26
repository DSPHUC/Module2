package Map_Tree.Use_Arr_LinkedList_In_JavaCollectionFramework;

import java.util.*;

public class ProductManager {
    private ArrayList<Product> products;
//    private LinkedList<Product> products2;

    public ProductManager() {
        products = new ArrayList<>();
//        products2 = new LinkedList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
//        products2.add(product);
        System.out.println("Thêm sản phẩm thành công");

    }

    public void editProduct(int id) {
        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                found = true;
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập tên mới cho sản phẩm");
                String newName = sc.nextLine();
                System.out.println("Nhập giá mới cho sản phẩm");
                double newPrice = sc.nextDouble();
                product.setName(newName);
                product.setPrice(newPrice);
                System.out.println("Sửa thông tin thành công");
                break;
            }
        }
//        for (Product product : products2) {
//            if (product.getId() == id) {
//                found = true;
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Nhập tên mới cho sản phẩm");
//                String newName = sc.nextLine();
//                System.out.println("Nhập giá mới cho sản phẩm");
//                double newPrice = sc.nextDouble();
//                product.setName(newName);
//                product.setPrice(newPrice);
//                System.out.println("Sửa thông tin thành công");
//                break;
//            }
//
//
//        }
        if (!found) {
            System.out.println("Không có sản phẩm có mã " + id);
        }
    }

    public void deleteProduct(int id) {
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                found = true;
                products.remove(i);
                System.out.println("Xóa sản phẩm thành công");
                break;
            }
        }
//        for (int i = 0; i < products2.size(); i++) {
//            if (products2.get(i).getId() == id) {
//                found = true;
//                products2.remove(i);
//                System.out.println("Xóa sản phẩm thành công");
//                break;
//            }
//        }

        if (!found) {
            System.out.println("Không có sản phẩm có mã " + id);
        }
    }

    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm");
        } else {
            System.out.println("Danh sách sản phẩm");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

//    public void displayProducts2() {
//
//        if (products2.isEmpty()) {
//            System.out.println("Không có sản phẩm");
//        } else {
//            System.out.println("Danh sách sản phẩm");
//            for (Product product : products2) {
//                System.out.println(product);
//            }
//        }
//    }

    public void searchProduct(String name/*, int option*/) {
        boolean found = false;
//        if (option == 1) {
            for (Product product : products) {
                if (product.getName().contains(name)) {
                    found = true;
                    System.out.println(product);
                }
            }
//        } else if (option == 2) {
//            for (Product product : products2) {
//                if (product.getName().contains(name)) {
//                    found = true;
//                    System.out.println(product);
//                }
//            }
//        }
        if (!found) {
            System.out.println("Không có sản phẩm nào tên " + name);
        }
    }

    public void sortProductsByPrice( int oder) {
//        if (option == 1) {
            Collections.sort(products, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    if (oder == 1) {
                        return Double.compare(o1.getPrice(), o2.getPrice());//tăng
                    } else if (oder == 2) {
                        return Double.compare(o2.getPrice(), o1.getPrice());//giảm
                    } else {
                        return 0;
                    }
                }
            });
            System.out.println("Sắp xếp sản phẩm thành công");
//        } else if (option == 2) {
//            Collections.sort(products2, new Comparator<Product>() {
//                @Override
//                public int compare(Product o1, Product o2) {
//                    if (oder == 1) {
//                        return Double.compare(o1.getPrice(), o2.getPrice());//tăng
//                    } else if (option == 2) {
//                        return Double.compare(o2.getPrice(), o1.getPrice());//giảm
//                    } else {
//                        return 0;
//                    }
//                }
//            });
//            System.out.println("Sắp xếp sản phẩm theo giá tăng dần thành công");
//        }else {
//            System.out.println("Không có lựa chọn sắp xếp "+option);
//        }
    }
    public void sortProductsByName(int oder){
        Collections.sort(products,new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            if (oder == 1) {
                return CharSequence.compare(o1.getName(), o2.getName());//tăng
            } else if (oder == 2) {
                return CharSequence.compare(o2.getName(), o1.getName());//giảm
            } else {
                return 0;
            }
        }
    });
            System.out.println("Sắp xếp sản phẩm thành công");
    }
}