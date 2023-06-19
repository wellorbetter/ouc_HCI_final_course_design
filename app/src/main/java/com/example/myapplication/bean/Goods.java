package com.example.myapplication.bean;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class Goods {
    private double price;
    private String name;
    private int id;
    private String desc;
    private int picture;

    public static Goods newInstance(double price, String name, int id, String desc, int picture) {
        return new Goods(price, name, id, desc, picture);
    }
    public Goods(double price, String name, int id, String desc, int picture) {
        this.price = price;
        this.name = name;
        this.id = id;
        this.desc = desc;
        this.picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
