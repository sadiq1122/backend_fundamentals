package org.example.dsa;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    public static void bubbleSort(List<Integer> list) {
        int len = list.size();
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }

        }
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(4, 3, 2, 6, 1, 89, 0));
        bubbleSort(nums);
        System.out.println(nums);

    }
}
