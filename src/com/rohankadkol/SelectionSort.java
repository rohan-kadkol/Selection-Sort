package com.rohankadkol;

import java.util.Comparator;

public class SelectionSort {
    /**
     * Iterative Selection Sort Algorithm.
     * Now apart from generics, we also pass in a custom Comparator. This helps us use the same method to not only sort
     * multiple types, but also to sort them in multiple ways.
     * Eg. We can sort Strings alphabetically, or by string length using the same method.
     * @param items items to be sorted
     * @param <T> Generic type of each of the item in items
     */
    public static <T> void iterative(T[] items, Comparator<T> comparator) {
        for (int i = 0; i < items.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < items.length; j++) {
                if (comparator.compare(items[j],items[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = items[i];
            items[i] = items[minIndex];
            items[minIndex] = temp;
        }
    }

    public static <T> void recursive(T[] items, Comparator<T> comparator) {
        recursive(items, 0, items.length - 1, comparator);
    }

    private static <T> void recursive(T[] items, int start, int end, Comparator<T> comparator) {
        if (start == end) {
            return;
        }

        int minIndex = minIndex(items, start + 1, end, comparator);
        if (comparator.compare(items[minIndex], items[start]) < 0) {
            T temp = items[start];
            items[start] = items[minIndex];
            items[minIndex] = temp;
        }
        recursive(items, start + 1, end, comparator);
    }

    private static <T> int minIndex(T[] items, int start, int end, Comparator<T> comparator) {
        if (start == end) {
            return start;
        }

        int minIndex = minIndex(items, start + 1, end, comparator);
        return comparator.compare(items[start], items[minIndex]) < 0 ? start : minIndex;
    }
}
