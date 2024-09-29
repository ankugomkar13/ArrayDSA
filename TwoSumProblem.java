package org.example;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String args[])
    {
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // Print the indices in a readable format using Arrays.toString
                    System.out.println(Arrays.toString(new int[] {i, j}));
                }

                }
    }
}}


