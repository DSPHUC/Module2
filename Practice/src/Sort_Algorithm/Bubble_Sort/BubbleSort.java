package Sort_Algorithm.Bubble_Sort;

public class BubbleSort {


    public static void bubbleSort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
