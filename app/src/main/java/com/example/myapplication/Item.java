package com.example.myapplication;

public class Item {
    private String title;
    private int imageRes;

    public Item(String title, int imageRes) {
        this.title = title;
        this.imageRes = imageRes;
    }

    public String getTitle() {
        return title;
    }

    public int getImageRes() {
        return imageRes;
    }
}
