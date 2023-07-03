package Search_Algorithm.Find_Max_Num_Recursive;

import java.util.Arrays;

public class Find {


    public static int binarySearch(int[] nums, int value) {
         int left=0;
         int right=nums.length-1;
        Arrays.sort(nums);
        Arrays.toString(nums);
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == value) {
                return mid;
            }
            if (value > nums[mid]) {
                left = mid + 1;
            }
            if (value < nums[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }
}

