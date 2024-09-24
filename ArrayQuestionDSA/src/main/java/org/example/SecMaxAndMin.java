package org.example;

public class SecMaxAndMin {
    static int sexMax(int[] arr,int n)
    {
        int max = arr[0];
        int secmax = arr[0];
        for(int i = 0;i<n;i++)
        {
            if(arr[i]>max)
            {
                secmax = max;
                max =arr[i];
            }
            else if(arr[i]>secmax)
            {
                secmax = arr[i];
            }
        }
        return secmax;
    }
    static int sexMix(int[] arr,int n)
    {
        int mix = arr[0];
        int secmix = arr[0];
        for(int i = 0;i<n;i++)
        {
            if(arr[i]<mix)
            {
                secmix = mix;
                mix =arr[i];
            }
            else if(arr[i]<secmix)
            {
                secmix = arr[i];
            }
        }
        return secmix;
    }
    public static void main(String args[])
    {
        int arr[] = {12,34,45,67,88,56};
        int n = arr.length;
        int secmax = SecMaxAndMin.sexMax(arr,n);
        int secmix = SecMaxAndMin.sexMix(arr,n);
        System.out.println(secmax);
        System.out.println(secmix);
    }

}
