package org.example;

public class FindTheMissingElement {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 5}; // Array missing '4'
        int flag;

        // Loop from 1 to nums.length + 1 to check for missing number
        for (int i = 1; i <= nums.length + 1; i++) {
            flag = 0; // Reset flag for each new number
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    flag = 1; // Mark flag as 1 if the number is found
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Missing number: " + i);
                break; // Exit the loop once the missing number is found
            }
        }
    }
}
