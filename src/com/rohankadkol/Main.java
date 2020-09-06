package com.rohankadkol;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] ints = new int[]{7, 2, 13, 24, 3, 6, 10};
        SelectionSort.iterative(ints);
        System.out.println(Arrays.toString(ints));
    }
}
