package Stack_Queue.Reverce;

import java.util.Arrays;
import java.util.Stack;

import static Stack_Queue.Reverce.Integer_Use_Stack.reverceArr;

public class Test_Integer {

    public static void main(String[] args) {
        int[] arrs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arrs));
        int[] rever = reverceArr(arrs);
        System.out.println(Arrays.toString(rever));


    }

    }
