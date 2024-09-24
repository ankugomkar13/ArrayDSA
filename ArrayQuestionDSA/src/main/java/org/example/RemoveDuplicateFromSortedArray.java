package org.example;

import java.util.Arrays;

class RemoveDuplicateFromSortedArray {

    // Optimal approach: Time complexity is O(n) and Space complexity is O(1)
    public static void main(String args[]) {
        int[] arr = {12, 13, 14, 12, 13, 14, 67, 67, 89};
        int n = arr.length;

        // Sort the array first to handle duplicates properly
        Arrays.sort(arr);

        // Call the function to remove duplicates
        int newLength = removeDuplicates(arr, n);

        // Print the updated array without duplicates up to the new length
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0) return 0; // Edge case: empty array

        int i = 0; // Pointer for the last unique element found

        // Use two pointers: j scans through the array, i keeps the last unique position
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;               // Increment i to point to the next unique slot
                arr[i] = arr[j];   // Move the next unique element to this slot
            }
        }

        return i + 1; // Return the length of the array with unique elements
    }
}
