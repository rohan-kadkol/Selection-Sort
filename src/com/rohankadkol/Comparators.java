package com.rohankadkol;

import java.util.Comparator;

public class Comparators {
    static Comparator<Integer> integersAscending = (i1, i2) -> i1 - i2;
    static Comparator<Integer> integersDescending = (i1, i2) -> i2 - i1;

    static Comparator<Double> doublesAscending = (d1, d2) -> (int) (d1 - d2);
    static Comparator<Double> doublesDescending = (d1, d2) -> (int) (d2 - d1);

    static Comparator<String> stringsAlphabeticallyAscending = (s1, s2) -> s1.compareTo(s2);
    static Comparator<String> stringsAlphabeticallyDescending = (s1, s2) -> s2.compareTo(s1);
    static Comparator<String> stringsLengthAscending = (s1, s2) -> s1.length() - s2.length();
    static Comparator<String> stringsLengthDescending = (s1, s2) -> s2.length() - s1.length();

    static Comparator<LsuTiger> tigersTigerCardNumberAscending = (t1, t2) -> t1.getTigerCardNumber().compareTo(t2.getTigerCardNumber());
    static Comparator<LsuTiger> tigersTigerCardNumberDescending = (t1, t2) -> t2.getTigerCardNumber().compareTo(t1.getTigerCardNumber());
    static Comparator<LsuTiger> tigersNameAlphabeticalAscending = (t1, t2) -> t1.getName().compareTo(t2.getName());
    static Comparator<LsuTiger> tigersNameAlphabeticalDescending = (t1, t2) -> t2.getName().compareTo(t1.getName());
}
