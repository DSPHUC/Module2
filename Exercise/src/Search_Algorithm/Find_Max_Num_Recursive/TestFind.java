package Search_Algorithm.Find_Max_Num_Recursive;

import java.util.Arrays;

import static Search_Algorithm.Find_Max_Num_Recursive.Find.binarySearch;

public class TestFind {
    public static void main(String[] args) {
        int[] nums = {2, 6, 9, 5, 0, 1, 8, 5, 7, 8};
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(binarySearch(nums,4));
    }
}