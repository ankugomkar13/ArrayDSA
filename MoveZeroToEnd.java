package org.example;

import java.util.ArrayList;

public class MoveZeroToEnd {
    public static void main(String args[])
    {
        //brute force
        int nums[] ={0,0,12,23,34,45,0,23,0,23,0,12,0,};
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i <nums.length; i++) {
            if (nums[i] != 0)
            {
                temp.add(nums[i]);
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }
        for (int i = temp.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
      for(int i=0;i<nums.length;i++)
      {
          System.out.print(nums[i]+" ");

      }
    }
}
