package Stack_Queue.Deployment_Queue_Use_LinkedList;

public class Use_Queue {
    static class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    static class Queue {
        static Node front;
        static Node rear;

        public Queue() {
            this.front = null;
            this.rear = null;
        }
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        //kiểm tra hàng đợi có trống hay không
        if (Queue.front == null) {
            Queue.front = Queue.rear = newNode;
        } else {
            newNode.link = Queue.front;
            Queue.rear.link = newNode;
            Queue.rear = newNode;
        }
        Queue.rear.link = Queue.front;
    }

    public void deQueue() {
        if (Queue.front == null) {
            System.out.println("Queue is empty.");
        } else {
            if (Queue.front == Queue.rear) {
                Queue.front = Queue.rear = null;
            } else {
                Queue.front = Queue.front.link;
                Queue.rear.link = Queue.front;
            }
        }
    }

    public void displayQueue() {
        if (Queue.front == null) {
            System.out.println("Queue is empty");
        } else {
            Node temp = Queue.front;
            System.out.println("Queue: ");
            while (temp.link != Queue.front) {
                System.out.println(temp.data + " ");
                temp = temp.link;
            }
            System.out.println(temp.data);
        }
    }

}



