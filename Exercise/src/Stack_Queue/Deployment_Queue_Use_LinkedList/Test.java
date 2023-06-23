package Stack_Queue.Deployment_Queue_Use_LinkedList;

public class Test {
    public static void main(String[] args) {
        Use_Queue queuequeuee = new Use_Queue();
        queuequeuee.displayQueue();
        queuequeuee.enQueue(14);//thêm 14
        queuequeuee.displayQueue();
        queuequeuee.enQueue(22);//thêm 22
        queuequeuee.displayQueue();
        queuequeuee.enQueue(-6);//thêm -6
        queuequeuee.displayQueue();
        queuequeuee.deQueue();//bỏ 14
        queuequeuee.displayQueue();
        queuequeuee.deQueue();//bỏ 22
        queuequeuee.displayQueue();
        queuequeuee.enQueue(9);//thêm 9
        queuequeuee.displayQueue();
        queuequeuee.enQueue(20);//thêm 20
        queuequeuee.displayQueue();

    }
}
