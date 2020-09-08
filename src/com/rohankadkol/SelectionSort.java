package com.rohankadkol;

public class SelectionSort {
    /**
     * Iterative Selection Sort Algorithm.
     * Notice how we use a generic T. This is so that the same function can be used to sort all types of Java objects.
     * Eg. Integers, Doubles, and Strings
     * @param items items to be sorted
     * @param <T> Generic type of each of the item in items
     */
    public static <T extends Comparable<T>> void iterative(T[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[j].compareTo(items[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = items[i];
            items[i] = items[minIndex];
            items[minIndex] = temp;
        }
    }

    public static <T extends Comparable<T>> void recursive(T[] items) {
        recursive(items, 0, items.length - 1);
    }

    private static <T extends Comparable<T>> void recursive(T[] items, int start, int end) {
        if (start == end) {
            return;
        }

        int minIndex = minIndex(items, start + 1, end);
        if (items[minIndex].compareTo(items[start]) < 0) {
            T temp = items[start];
            items[start] = items[minIndex];
            items[minIndex] = temp;
        }
        recursive(items, start + 1, end);
    }

    private static <T extends Comparable<T>> int minIndex(T[] items, int start, int end) {
        if (start == end) {
            return start;
        }

        int minIndex = minIndex(items, start + 1, end);
        return items[start].compareTo(items[minIndex]) < 0 ? start : minIndex;
    }
}
