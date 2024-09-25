package org.example;

import java.util.Arrays;

public class RotateTheArrayByKPlace {

    // Function to reverse a portion of the array from 'start' to 'end'
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array by 'k' places
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Step 1: Reverse the first 'k' elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse the remaining 'n-k' elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse the whole array to achieve the final rotation
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {12, 23, 4, 5, 67, 89, 1, 3, 4, 6};
        int k = 4; // Number of positions to rotate

        System.out.println("Original array: " + Arrays.toString(arr));

        rotateArray(arr, k);

        System.out.println("Array after rotating by " + k + " positions: " + Arrays.toString(arr));
    }
}
