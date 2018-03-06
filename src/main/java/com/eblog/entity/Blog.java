package com.eblog.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * Created by teemper on 2018/3/4, 19:55.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */

public class Blog {

    private String title;
    private Date initDate;
    private User author;
    @JsonIgnore
    private String context;
    private boolean update;
    private String description;



    public Blog(String title, Date initDate, User author, String context, boolean update,String description) {
        this.title = title;
        this.initDate = initDate;
        this.author = author;
        this.context = context;
        this.update = update;
        this.description = description;
    }

    public Blog() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Blog{" + "title='" + title + '\'' + ", initDate=" + initDate + ", author='" + author + '\'' +  ", update=" + update + '}';
    }
}
