package org.example;

public class CheckArrraySort {
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5};
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {

            }
            else {
                System.out.println("Array is not Sorted");
            }
        }
        System.out.println("Array is Sorted");
    }
}
