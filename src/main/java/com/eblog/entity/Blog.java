package com.eblog.entity;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by teemper on 2018/3/4, 19:55.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */

@Entity
public class Blog {

    private String title;
    private Date initDate;
    private String author;
    private String context;
    private boolean update;


    public Blog(String title, Date initDate, String author, String context, boolean update) {
        this.title = title;
        this.initDate = initDate;
        this.author = author;
        this.context = context;
        this.update = update;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
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

    @Override
    public String toString() {
        return "Blog{" + "title='" + title + '\'' + ", initDate=" + initDate + ", author='" + author + '\'' +  ", update=" + update + '}';
    }
}
