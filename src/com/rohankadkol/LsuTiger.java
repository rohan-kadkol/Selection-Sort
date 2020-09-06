package com.rohankadkol;

public class LsuTiger {
    private String tigerCardNumber;
    private String name;

    public LsuTiger(String tigerCardNumber, String name) {
        this.tigerCardNumber = tigerCardNumber;
        this.name = name;
    }

    public String getTigerCardNumber() {
        return tigerCardNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + tigerCardNumber + ")";
    }
}
