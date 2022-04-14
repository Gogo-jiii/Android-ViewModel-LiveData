package com.example.livedata;

public class MyModelClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyModelClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
