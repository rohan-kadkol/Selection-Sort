package com.rohankadkol;

public class Main {

    public static void main(String[] args) {
        int[] sorted = SelectionSort.iterative(new int[]{7, 2, 13, 24, 3, 6, 10});
        System.out.printf("%d", sorted[0]);
        for (int i=1; i<sorted.length; i++) {
            System.out.printf(", %d", sorted[i]);
        }
    }
}
