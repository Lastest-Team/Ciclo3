package com.lastestteam.ciclo3.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Profile")
@ToString
public class Profile {
    @Id
    @Getter
    @Setter
    @Column(name = "id")
    private Long id;
    @Getter @Setter @Column (name = "UserName")
    private String username;
/*
    @Getter @Setter @Column (name = "email")
    private String email;

    @Getter @Setter @Column (name = "profile")
    private String profile;

    @Getter @Setter @Column (name = "role")
    private String role;

    @Getter @Setter @Column (name = "enterprise")
    private String enterprise;
*/
    @Getter @Setter @Column (name = "Password")
    private String password;

/*
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
        this.user = user;*/
    //}
}
