package org.example;

public class RotatedArrayLeftByOne {
   public static void main(String args[])
   {
       int[] arr ={12,34,56,12,34,67};
       int temp = arr[0];
       int n=arr.length;
       for(int i =1;i<n;i++)
       {
           arr[i-1]=arr[i];
       }
       arr[n-1] = temp;
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
   }
}
