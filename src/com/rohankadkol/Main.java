package com.rohankadkol;

public class Main {

    public static void main(String[] args) {
        // Notice how the same SelectionSort.iterative() method is being used to sort Integers, Doubles, and Strings.

        Integer[] sortedIntegers = SelectionSort.iterative(new Integer[]{7, 2, 13, 24, 3, 6, 10});
        System.out.printf("%d", sortedIntegers[0]);
        for (int i = 1; i < sortedIntegers.length; i++) {
            System.out.printf(", %d", sortedIntegers[i]);
        }
        System.out.println();

        Double[] sortedDoubles = SelectionSort.iterative(new Double[]{7.3, 2.2, 13.5, 24.9, 3.1, 6.0, 10.2});
        System.out.printf("%.1f", sortedDoubles[0]);
        for (int i = 1; i < sortedDoubles.length; i++) {
            System.out.printf(", %.1f", sortedDoubles[i]);
        }
        System.out.println();

        String[] sortedStrings = SelectionSort.iterative(new String[]{"Albert", "Steven", "Bernard", "Juliet", "Samantha", "Jessica", "Darnell"});
        System.out.printf("%s", sortedStrings[0]);
        for (int i = 1; i < sortedStrings.length; i++) {
            System.out.printf(", %s", sortedStrings[i]);
        }
    }
}
