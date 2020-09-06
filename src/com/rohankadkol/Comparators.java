package com.rohankadkol;

import java.util.Comparator;

public class Comparators {
    static Comparator<Integer> integersAscending = new Comparator<Integer>() {
        @Override
        public int compare(Integer i1, Integer i2) {
            return i1 - i2;
        }
    };

    static Comparator<Integer> integersDescending = new Comparator<Integer>() {
        @Override
        public int compare(Integer i1, Integer i2) {
            return i2 - i1;
        }
    };

    static Comparator<Double> doublesAscending = new Comparator<Double>() {
        @Override
        public int compare(Double d1, Double d2) {
            return (int) (d1 - d2);
        }
    };

    static Comparator<Double> doublesDescending = new Comparator<Double>() {
        @Override
        public int compare(Double d1, Double d2) {
            return (int) (d2 - d1);
        }
    };

    static Comparator<String> stringsAlphabeticallyAscending = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    };

    static Comparator<String> stringsAlphabeticallyDescending = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return s2.compareTo(s1);
        }
    };

    static Comparator<String> stringsLengthAscending = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    };

    static Comparator<String> stringsLengthDescending = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return s2.length() - s1.length();
        }
    };

    static Comparator<LsuTiger> tigersTigerCardNumberAscending = new Comparator<LsuTiger>() {
        @Override
        public int compare(LsuTiger t1, LsuTiger t2) {
            return t1.getTigerCardNumber().compareTo(t2.getTigerCardNumber());
        }
    };

    static Comparator<LsuTiger> tigersTigerCardNumberDescending = new Comparator<LsuTiger>() {
        @Override
        public int compare(LsuTiger t1, LsuTiger t2) {
            return t2.getTigerCardNumber().compareTo(t1.getTigerCardNumber());
        }
    };

    static Comparator<LsuTiger> tigersNameAlphabeticalAscending = new Comparator<LsuTiger>() {
        @Override
        public int compare(LsuTiger t1, LsuTiger t2) {
            return t1.getName().compareTo(t2.getName());
        }
    };

    static Comparator<LsuTiger> tigersNameAlphabeticalDescending = new Comparator<LsuTiger>() {
        @Override
        public int compare(LsuTiger t1, LsuTiger t2) {
            return t2.getName().compareTo(t1.getName());
        }
    };
}
