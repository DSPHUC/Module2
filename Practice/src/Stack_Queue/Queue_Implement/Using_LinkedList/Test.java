package Stack_Queue.Queue_Implement.Using_LinkedList;

import Stack_Queue.Queue_Implement.Using_LinkedList.MyLinkedListQueue;

public class Test {
    public static void main(String[] args) {
        MyLinkedListQueue queue =new MyLinkedListQueue();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(9);
        System.out.println("Dequeue item is: "+queue.dequeue().key);
        System.out.println("Dequeue item is: "+queue.dequeue().key);
        System.out.println("Dequeue item is: "+queue.dequeue().key);
    }
}
