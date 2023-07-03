package Sort_Algorithm.Sort_Select;

public class SelectionSort {
    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int findMin = min(arr, i);
            swap(arr, i, findMin);
        }

    }

    public static int min(int[] arr, int index) {
        int i = index;
        int min = i;
        while (i < arr.length-1) {
            if (arr[min] > arr[i+1]) {
                min = i+1;
            }
            i++;
        }
        return min;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
