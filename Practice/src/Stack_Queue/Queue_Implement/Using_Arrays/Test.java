package Stack_Queue.Queue_Implement.Using_Arrays;

public class Test {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.enqueue(1);
        myQueue.dequeue();
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.dequeue();
        myQueue.enqueue(5);
        myQueue.dequeue();
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.enqueue(8);
        myQueue.enqueue(9);

    }
}
