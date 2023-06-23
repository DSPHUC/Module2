package Stack_Queue.Queue_Implement.Using_Arrays;

public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head;
    public int tail;
    public int currentSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = currentSize == capacity;
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = currentSize == 0;
        return status;
    }

    public void enqueue(int item) {

    }

    public void dequeue() {

    }
}
