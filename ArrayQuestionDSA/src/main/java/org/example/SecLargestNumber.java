package org.example;

public class SecLargestNumber {
    public static void main(String args[])
    { //brute force approch
        int[] arr = {12,34,56,78,90,12,45,90};
        int max=arr[0],secmax = arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>max)
            {
                secmax = max;
                max = arr[i];
            }
            else if(arr[i]>secmax)
            {
                secmax = arr[i];
            }
        }
        System.out.println(secmax);
    }
}
