package Sort_Algorithm.Bubble_Sort;

import java.util.Arrays;

import static Sort_Algorithm.Bubble_Sort.BubbleSort.bubbleSort;
import static Sort_Algorithm.Bubble_Sort.BubbleSort.swap;

public class TestSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, -7, -9, 15, -2, 3, -5, 7, 9};
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
