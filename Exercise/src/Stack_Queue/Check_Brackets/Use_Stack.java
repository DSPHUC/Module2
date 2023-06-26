package Stack_Queue.Check_Brackets;

import java.util.Stack;

public class Use_Stack {
    public static boolean check(String s) {

        Stack<Character> bStack = new Stack<>();
        for (char sym : s.toCharArray()) {
            if (sym == '(' || sym == '{' || sym == '[') {
                bStack.push(sym);
            } else if (sym == ')' || sym == '}' || sym == ']') {
//                bStack.push(sym);

                if (bStack.isEmpty()) {
                    return false;
                }
                char left = bStack.pop();
                if (left == '(' && sym != ')' || left == '{' && sym != '}' || left == '[' && sym != ']') {
                    return false;
                }
            }

        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(check("5*2+6*(3*2-4))*((9+4/2)*2(7*(2+5))"));
    }
}