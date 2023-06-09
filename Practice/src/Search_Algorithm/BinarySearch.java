package Search_Algorithm;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
        int left = 0;
        int right = list.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (key == list[mid]) {
                return mid;
            } else if (key > list[mid]) {
                left = mid + 1;
            } else {
                right = mid-1;
            }
        }return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,7));
        System.out.println(binarySearch(list,66));
        System.out.println(binarySearch(list,71));
    }
}
