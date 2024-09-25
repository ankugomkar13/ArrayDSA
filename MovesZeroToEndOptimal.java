package org.example;

public class MovesZeroToEndOptimal {
    public static void main(String args[])
    {
        int nums[]={12,34,0,56,78,0,24,0,230,23,0};
        int j=-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) {
                j = i;
                break;
            }
        }
        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
