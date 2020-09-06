package com.rohankadkol;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Notice how the same SelectionSort.iterative() method is being used to sort Integers, Doubles, and Strings.

        Integer[] integers = new Integer[]{7, 2, 13, 24, 3, 6, 10};
        SelectionSort.iterative(integers);
        System.out.println(Arrays.toString(integers));
        System.out.println();

        Double[] doubles = new Double[]{7.3, 2.2, 13.5, 24.9, 3.1, 6.0, 10.2};
        SelectionSort.iterative(doubles);
        System.out.println(Arrays.toString(doubles));
        System.out.println();

        String[] strings = new String[]{"Albert", "Steven", "Bernard", "Juliet", "Samantha", "Jessica", "Darnell"};
        SelectionSort.iterative(doubles);
        System.out.println(Arrays.toString(strings));
        System.out.println();
    }
}
