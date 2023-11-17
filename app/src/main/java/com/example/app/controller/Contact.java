package com.example.app.controller;

public class Contact {
    private String name;
    private int imageResourcedId;

    public Contact (String name, int ImageResourcedId) {
        this.name = name;
        this.imageResourcedId = ImageResourcedId;
    }

    public String getName() {
        return this.name;
    }

    public int getImageResourceId() {
        return this.imageResourcedId;
    }

    //getters...
}
