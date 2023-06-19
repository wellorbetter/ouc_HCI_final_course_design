package com.example.myapplication.bean;

import android.graphics.drawable.Drawable;

import androidx.room.Entity;

import java.util.List;

public class User {
    private int id;  // 序号
    private String name;  // 姓名
    private int age;  // 年龄
    private long height;  // 身高
    private float weight;  // 体重
    private boolean married;  // 是否结婚

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Drawable getAvatar() {
        return avatar;
    }

    public void setAvatar(Drawable avatar) {
        this.avatar = avatar;
    }

    public List<Integer> getCollections() {
        return collections;
    }

    public void setCollections(List<Integer> collections) {
        this.collections = collections;
    }

    public List<Integer> getFollower() {
        return follower;
    }

    public void setFollower(List<Integer> follower) {
        this.follower = follower;
    }

    public List<Integer> getFollowee() {
        return followee;
    }

    public void setFollowee(List<Integer> followee) {
        this.followee = followee;
    }

    private String address; // 地址
    private Drawable avatar; // 头像，这里不用bitmap，时间不够用

    private List<Integer> collections; // 收藏商品的id
    private List<Integer> follower; // 关注我的
    private List<Integer> followee; // 关注我的

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public User(int id, String name, int age, long height, float weight, boolean married, String address, Drawable avatar, List<Integer> collections, List<Integer> follower, List<Integer> followee) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.married = married;
        this.address = address;
        this.avatar = avatar;
        this.collections = collections;
        this.follower = follower;
        this.followee = followee;
    }

    public User () {

    }


}
