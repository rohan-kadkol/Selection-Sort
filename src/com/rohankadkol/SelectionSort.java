package com.rohankadkol;

public class SelectionSort {
    public static int[] iterative(int[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[j] < items[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = items[i];
            items[i] = items[minIndex];
            items[minIndex] = temp;
        }
        return items;
    }
}
