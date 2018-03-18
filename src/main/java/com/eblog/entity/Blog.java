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
    private String synopsis;
    private Date initDate;
    private User author;
    private String content;
    private boolean update;
    private boolean shared = true;



    public Blog() {
    }


    public Blog(String title, String synopsis, Date initDate, User author, String content, boolean update, boolean shared) {
        this.title = title;
        this.synopsis = synopsis;
        this.initDate = initDate;
        this.author = author;
        this.content = content;
        this.update = update;
        this.shared = shared;
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

    public String getContent() {
        return content;
    }

    public void setContent(String context) {
        this.content = context;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    @Override
    public String toString() {
        return "Blog{" + "title='" + title + '\'' + ", synopsis='" + synopsis + '\'' + ", initDate=" + initDate + ", author=" + author + ", content='" + content + '\'' + ", update=" + update + '}';
    }

}
