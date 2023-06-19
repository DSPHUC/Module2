package List_Basic.LinkedLists;

public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println("TESTING");
        LinkedList ll = new LinkedList(10);
        ll.addFirt(11);
        ll.addFirt(12);
        ll.addFirt(8);
        ll.addFirt(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.add(2,0);
        ll.printList();
    }
}
