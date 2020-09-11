package com.rohankadkol;

public class SelectionSort {
    /**
     * Iterative Selection Sort Algorithm.
     * Sort ints in ascending order.
     * @param items items to be sorted
     */
    public static void iterative(int[] items) {
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
    }

    /**
     * Public recursive selection sort algorithm.
     * @param items items to be sorted
     */
    public static void recursive(int[] items) {
        recursive(items, 0, items.length - 1);
    }

    /**
     * Private recursive selection sort algorithm.
     * @param items items to be sorted
     * @param start start index
     * @param end end index
     */
    private static void recursive(int[] items, int start, int end) {
        if (start == end) {
            return;
        }

        int minIndex = minIndex(items, start + 1, end);
        if (items[minIndex] < items[start]) {
            int temp = items[start];
            items[start] = items[minIndex];
            items[minIndex] = temp;
        }
        recursive(items, start + 1, end);
    }

    /**
     * Finds the min index in items between indices start and end
     * @param items items to be sorted
     * @param start start index
     * @param end end index
     * @return the min index in items between indices start and end
     */
    private static int minIndex(int[] items, int start, int end) {
        if (start == end) {
            return start;
        }

        int minIndex = minIndex(items, start + 1, end);
        return items[start] < items[minIndex] ? start : minIndex;
    }
}
