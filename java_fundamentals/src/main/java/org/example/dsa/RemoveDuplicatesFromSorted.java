package org.example.dsa;

import java.util.Arrays;

public class RemoveDuplicatesFromSorted {

    public static void removeDuplicate(int[] arr) {
        int pos = 0;
        if (arr.length == 1) {
            return;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[++pos] = arr[i + 1];
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2};
        removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));

    }
}
