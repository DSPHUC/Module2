package Stack_Queue.Reverce;

import java.util.Arrays;
import java.util.Stack;

public class Integer_Use_Stack {
    public static int[] reverceArr(int[] arrs) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arrs.length; i++) {
            stack.push(arrs[i]);
        }

        int i = 0;
        while (!stack.empty()) {
            arrs[i] = stack.pop();
            i++;
        }
        return arrs;

    }


}
