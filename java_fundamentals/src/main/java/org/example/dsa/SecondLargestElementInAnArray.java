package org.example.dsa;

import java.util.Arrays;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 10, 11, -5, 23};


        // sorting - nlogn approach
        Arrays.sort(arr);
        int end = arr.length - 1;
        int x = arr[end];
        int j = end - 1;
        while (arr[j] == x) {
            j--;
        }
        System.out.println("Second largest element is: " + arr[j]);


        // using 2 vars
        arr = new int[]{1, 4};
        end = arr.length - 1;
        int a = arr[0];
        int b = arr[1];
        System.out.println("end is " + end);

        for (int i = 0; i <= end; i++) {
            if (arr[i] > a) {
                b = a;
                a = arr[i];
            } else {
                if (b > arr[i]) {
                    b = arr[i];
                }
            }
        }

        System.out.println("a " + a);
        System.out.println("b " + b);
    }
}
