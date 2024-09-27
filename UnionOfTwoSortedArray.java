package org.example;

import java.util.ArrayList;

public class UnionOfTwoSortedArray {
    public static void main(String args[])
    {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        // Traverse both arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            else {
                if (arr1[i] >= arr2[j]) {
                    if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                        union.add(arr2[j]);
                    }
                    j++;
                }
            }
        }
        while (i < arr1.length) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        // Print the union
        for (int z = 0; z < union.size(); z++) {
            System.out.print(union.get(z) + " ");
        }
    }
}
