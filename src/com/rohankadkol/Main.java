package com.rohankadkol;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Now along with the array of items, we also pass in a custom Comparator.

        Integer[] integers = new Integer[]{7, 2, 13, 24, 3, 6, 10};
        System.out.println("Initial integers array:");
        System.out.println(Arrays.toString(integers));
        SelectionSort.iterative(integers, Comparators.integersAscending);
        System.out.println("Ascending integers:");
        System.out.println(Arrays.toString(integers));
        SelectionSort.iterative(integers, Comparators.integersDescending);
        System.out.println("Descending integers:");
        System.out.println(Arrays.toString(integers));

        System.out.println();

        Double[] doubles = new Double[]{7.3, 2.2, 13.5, 24.9, 3.1, 6.0, 10.2};
        System.out.println("Initial doubles array:");
        System.out.println(Arrays.toString(doubles));
        SelectionSort.iterative(doubles, Comparators.doublesAscending);
        System.out.println("Ascending doubles:");
        System.out.println(Arrays.toString(doubles));
        SelectionSort.iterative(doubles, Comparators.doublesDescending);
        System.out.println("Descending doubles:");
        System.out.println(Arrays.toString(doubles));

        System.out.println();

        String[] strings = new String[]{"Albert", "Steven", "Bernard", "Juliet", "Samantha", "Jessica", "Darnell", "Mike", "Bo"};
        System.out.println("Initial strings array:");
        System.out.println(Arrays.toString(strings));
        SelectionSort.iterative(strings, Comparators.stringsAlphabeticallyAscending);
        System.out.println("Ascending alphabetical:");
        System.out.println(Arrays.toString(strings));
        SelectionSort.iterative(strings, Comparators.stringsAlphabeticallyDescending);
        System.out.println("Descending alphabetical:");
        System.out.println(Arrays.toString(strings));
        SelectionSort.iterative(strings, Comparators.stringsLengthAscending);
        System.out.println("Ascending string lengths:");
        System.out.println(Arrays.toString(strings));
        SelectionSort.iterative(strings, Comparators.stringsLengthDescending);
        System.out.println("Descending string lengths:");
        System.out.println(Arrays.toString(strings));

        System.out.println();

        LsuTiger[] tigers = new LsuTiger[]{
                new LsuTiger("89-122-9223", "Carol"),
                new LsuTiger("89-621-7280", "Michael"),
                new LsuTiger("89-443-8227", "Richard"),
                new LsuTiger("89-378-1992", "Singh"),
                new LsuTiger("89-310-0482", "Mikhail"),
                new LsuTiger("89-745-2905", "Makayla"),
                new LsuTiger("89-122-1211", "Tobias"),
        };
        System.out.println("Initial tigers array:");
        System.out.println(Arrays.toString(tigers));
        SelectionSort.iterative(tigers, Comparators.tigersTigerCardNumberAscending);
        System.out.println("Ascending tiger card number:");
        System.out.println(Arrays.toString(tigers));
        SelectionSort.iterative(tigers, Comparators.tigersTigerCardNumberDescending);
        System.out.println("Descending tiger card numbers:");
        System.out.println(Arrays.toString(tigers));
        SelectionSort.iterative(tigers, Comparators.tigersNameAlphabeticalAscending);
        System.out.println("Ascending names:");
        System.out.println(Arrays.toString(tigers));
        SelectionSort.iterative(tigers, Comparators.tigersNameAlphabeticalDescending);
        System.out.println("Descending names:");
        System.out.println(Arrays.toString(tigers));
    }
}
