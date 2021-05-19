package com.geek.and14.fragments;

public class FirstFragmentModel {
    private String name;
    private String secondName;

    public FirstFragmentModel(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }
}
