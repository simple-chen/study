package com.example.listviewtest;

public class Fruit {
    private String name;
    private int imageSource;

    public Fruit(String name, int imageSource) {
        this.name = name;
        this.imageSource = imageSource;
    }

    public String getName() {
        return name;
    }

    public int getImageSource() {
        return imageSource;
    }
}
