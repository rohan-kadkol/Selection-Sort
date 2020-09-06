package com.rohankadkol;

import java.util.Comparator;

public class SelectionSort {
//    public static int[] iterative(int[] items) {
//        for (int i = 0; i < items.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < items.length; j++) {
//                if (items[j] < items[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp = items[i];
//            items[i] = items[minIndex];
//            items[minIndex] = temp;
//        }
//        return items;
//    }

//    public static <T extends Comparable<T>> T[] iterative(T[] items) {
//        for (int i = 0; i < items.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < items.length; j++) {
//                if (items[j].compareTo(items[minIndex]) < 0) {
//                    minIndex = j;
//                }
//                // -1, 0, 1
//                // a.compareTo(b) ->
//                // -1 if a < b
//                // 0 if  a = b
//                // +1 if a > b
//            }
//            T temp = items[i];
//            items[i] = items[minIndex];
//            items[minIndex] = temp;
//        }
//        return items;
//    }

    public static <T> T[] iterative(T[] items, Comparator<T> comparator) {
        for (int i = 0; i < items.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < items.length; j++) {
                if (comparator.compare(items[j], items[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = items[i];
            items[i] = items[minIndex];
            items[minIndex] = temp;
        }
        return items;
    }
}
