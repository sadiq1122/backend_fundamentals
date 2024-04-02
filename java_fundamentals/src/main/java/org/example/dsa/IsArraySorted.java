package org.example.dsa;

public class IsArraySorted {

    public static boolean isSorted(int[] arr) {
        // check for inversions
        // inversion is when a[i] > a[i+1]
        // edge case - having inversion at end
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
            if (arr[0] < arr[arr.length - 1]) {
                count++;
            }
            if (count <= 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{3, 4, 5, 1, 2};
        //1,2,3,4,5
        System.out.println(isSorted(arr));
    }
}
