package Stack_Queue.Stack_Deployment.Using_Arrays;

public class MyStack {
    public int[] arr;
    public int size;
    public int index = 0;

    public MyStack(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return  arr[--index];
    }
    public int size(){
        return index;
    }
    boolean isEmpty(){
        if (index==0){
            return true;
        }
        return  false;
    }
    private boolean isFull() {
        if (index==size){
            return  true;
        }
        return false;
    }
}
