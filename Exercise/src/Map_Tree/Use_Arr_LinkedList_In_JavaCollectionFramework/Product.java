package Map_Tree.Use_Arr_LinkedList_In_JavaCollectionFramework;

public class Product {
    public static int currentId;
    private int id;
    private String name;
    private double price;

    public Product( String name, double price) {
        this.id = ++currentId;
        this.name = name;
        this.price = price;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        Product.currentId = currentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id: " + id
                + ", name: " + name + '\''
                + ", price: " + price + '}';
    }
}
