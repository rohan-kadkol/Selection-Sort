package com.rohankadkol;

public class LsuTiger {
    private String _89Number;
    private String name;

    public LsuTiger(String _89Number, String name) {
        this._89Number = _89Number;
        this.name = name;
    }

    public String get_89Number() {
        return _89Number;
    }

    public void set_89Number(String _89Number) {
        this._89Number = _89Number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
