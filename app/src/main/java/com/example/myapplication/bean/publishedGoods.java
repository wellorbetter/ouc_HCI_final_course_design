package com.example.myapplication.bean;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class publishedGoods extends Goods{
    private int user_id; // 用户的id
    private int avatar; // 实际上我感觉要用id去查这个头像，但是这里为了方便，就直接传进来
    private String nickname; // 用户名称

    public static publishedGoods newInstance(double price, String name, int id, String desc, int picture, int user_id, int avatar, String nickname) {
        return new publishedGoods(price, name, id, desc, picture, user_id, avatar, nickname);
    }
    public publishedGoods(double price, String name, int id, String desc, int picture, int user_id, int avatar, String nickname) {
        super(price, name, id, desc, picture);
        this.user_id = user_id;
        this.avatar = avatar;
        this.nickname = nickname;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "publishedGoods{" +
                "user_id=" + user_id +
                ", avatar=" + avatar +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
