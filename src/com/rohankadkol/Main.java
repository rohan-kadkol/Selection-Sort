package com.rohankadkol;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] ints = new int[]{7, 2, 13, 24, 3, 6, 10};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(ints));
        SelectionSort.recursive(ints);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(ints));
    }
}
