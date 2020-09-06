package com.rohankadkol;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//        Integer[] sorted = SelectionSort.iterative(new Integer[]{7, 2, 13, 24, 3, 6, 10});
//        for (int num : sorted) {
//            System.out.println(num);
//        }

        LsuTiger[] tigers = new LsuTiger[]{
                new LsuTiger("89-576-8593", "Sarah"),
                new LsuTiger("89-176-8593", "Robert"),
                new LsuTiger("89-876-8593", "Steve"),
                new LsuTiger("89-276-8593", "Samuel"),
                new LsuTiger("89-476-8593", "Albert"),
                new LsuTiger("89-076-8593", "Henry"),

        };

        Comparator<LsuTiger> _89Comparator = new Comparator<LsuTiger>() {
            @Override
            public int compare(LsuTiger t1, LsuTiger t2) {
                return t1.get_89Number().compareTo(t2.get_89Number());
            }
        };

        Comparator<LsuTiger> nameComparator = new Comparator<LsuTiger>() {
            @Override
            public int compare(LsuTiger t1, LsuTiger t2) {
                return t1.getName().compareTo(t2.getName());
            }
        };

        tigers = SelectionSort.iterative(tigers, nameComparator);

        for (LsuTiger tiger : tigers) {
            System.out.println("___");
            System.out.println(tiger.get_89Number());
            System.out.println(tiger.getName());
            System.out.println("___");
        }
    }
}
