package com.lastestteam.ciclo3.entities;

public class Profile {
    private String img;
    private String phone;
    private User user;

    public Profile(String img, String phone, User user) {
        this.img = img;
        this.phone = phone;
        this.user = user;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
