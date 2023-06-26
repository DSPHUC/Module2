package Stack_Queue.Check_Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Use_Stack_And_Queue {
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        s=s.toLowerCase();
        for (char c : s.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }
        while (!stack.isEmpty() && !queue.isEmpty()){

                if (stack.pop()!=queue.remove()){
                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(check("12345667"));
        System.out.println(check("123321"));
        System.out.println(check("Able was I ere I saw Elba"));
    }
}