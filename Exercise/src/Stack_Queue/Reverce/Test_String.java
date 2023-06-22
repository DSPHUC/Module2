package Stack_Queue.Reverce;
import java.util.Arrays;

import static Stack_Queue.Reverce.Integer_Use_Stack.*;
import static Stack_Queue.Reverce.String_Use_Stack.reverseString;

public class Test_String {
    public static void main(String[] args) {
        String input = "Hello, Reverce in String use Stack";
        String[] output = reverseString(input);
        System.out.println(Arrays.toString(output));
    }


}