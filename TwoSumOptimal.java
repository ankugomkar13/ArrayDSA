package org.example;

import java.util.Arrays;

public class TwoSumOptimal {
   public static void main(String args[])
   {
       int nums[] = {12,23,45,76,23,56};
       int target = 35;
       int left = 0,right = nums.length-1;
       while(left<right)
       {
            int sum = nums[left]+nums[right];
            if(sum == target)
            {
                System.out.print("Yes");
                System.out.print(Arrays.toString(new int[]{left,right}));
            }
            else if(sum < target)
            {
                left++;
                right--;
            }
       }
   }
}
