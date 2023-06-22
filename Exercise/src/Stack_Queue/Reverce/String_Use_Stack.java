package Stack_Queue.Reverce;

import java.util.Arrays;
import java.util.Stack;

public class String_Use_Stack {
    public static String[]  reverseString(String input) {
        Stack<String> wStack = new Stack<>();
        String[] words = input.split(" ");
        System.out.println(Arrays.toString(words));

        for (String word : words) {
            wStack.push(word);
        }
        String output = " ";
        while (!wStack.empty()) {
            String mWord = wStack.pop();
            output += mWord + " ";
        }
        return new String[]{output};
    }
}