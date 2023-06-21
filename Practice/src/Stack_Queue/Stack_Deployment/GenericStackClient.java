package Stack_Queue.Stack_Deployment;

public class GenericStackClient {
    public static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1 String");
        System.out.println("1.1 Size of stack after push operations: "
                + stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %s",stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operations: "
                +stack.size());
    }
    public static void stackOfInterger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2 Interger");
        System.out.println("2.1 Size of stack after push operations: "
                + stack.size());
        System.out.println("2.2 Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %s",stack.pop());
        }
        System.out.println("\n  2.3 Size of stack after pop operations: "
                +stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of String");
        stackOfIStrings();
        System.out.println("2. Stack of intergers");
        stackOfInterger();
    }
}
