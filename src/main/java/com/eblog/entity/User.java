package com.eblog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by teemper on 2018/3/4, 20:01.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */


@Entity(name = "BLOG_USER")
public class User {
    @Id
    private long id;
    private String name;
    private String password;
    private String phone;
    private boolean male;
    private String email;


    public User(long id, String name, String password, String phone, boolean male, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.male = male;
        this.email = email;
    }


    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", password='" + password + '\'' + ", phone='" + phone + '\'' + ", male=" + male + ", email='" + email + '\'' + '}';
    }
}
