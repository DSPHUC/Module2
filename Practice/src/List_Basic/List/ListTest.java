package List_Basic.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> listInteger = new List<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(8);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(7);
        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
        listInteger.get(-1);
        System.out.println("element -1: " +listInteger.get(-1));
    }
}
