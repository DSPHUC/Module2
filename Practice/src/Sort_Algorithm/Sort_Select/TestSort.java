package Sort_Algorithm.Sort_Select;

import java.util.Arrays;

import static Sort_Algorithm.Bubble_Sort.BubbleSort.bubbleSort;

public class TestSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, -7, -9, 5, -2, 3, -5, 7, 9};
        System.out.println(Arrays.toString(arr));
        SelectionSort.selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
