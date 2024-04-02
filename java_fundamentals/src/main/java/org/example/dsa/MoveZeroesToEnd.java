package org.example.dsa;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 3, 4, 5, 0};
        int j = -1;
        int i = 0;
        // find the first 0
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 0) {
                j = k;
                break;
            }
        }

        if (j != -1) {
            for (i = j + 1; i < arr.length; i++) {

                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
