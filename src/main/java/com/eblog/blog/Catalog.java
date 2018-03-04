package com.eblog.blog;

import com.eblog.entity.Blog;
import com.eblog.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by teemper on 2018/3/4, 20:56.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class Catalog {
    private String name;
    private List<User> users;
    private List<Blog> blogs;
    private List<Catalog> catalogs;

    public Catalog(List<Blog> blogs, List<Catalog> catalogs) {
        this.blogs = blogs;
        this.catalogs = catalogs;
    }

    public Catalog() {

    }

    /**
     * get the list blog under this catalog.
     * @return list blog
     */
    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
    /**
     * get the list Catalog under this catalog.
     * @return list Catalog
     */
    public List<Catalog> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

    /**
     * add a blog element to the list
     * @param blog:
     * @return boolean
     */
    public boolean addBlog(Blog blog) {
        if (blogs == null)
            blogs = new CopyOnWriteArrayList<>();
        else
            blogs = getBlogs();
        return blogs.add(blog);

    }
    /**
     * remove a blog element to the list
     * @param blog:
     * @return boolean
     */
    public boolean removeBlog(Blog blog) {
        if (blogs!=null){
            blogs = getBlogs();
           return  blogs.remove(blog);
        }
        return false;
    }

    /**
     * add a catalog element to the list
     * @param catalog :
     * @return boolean
     */
    public boolean addCatalog(Catalog catalog) {
        if (catalogs == null)
            catalogs = new CopyOnWriteArrayList<>();
        else catalogs = getCatalogs();
        return catalogs.add(catalog);
    }

    /**
     * remove a catalog element to the list
     * @param catalog:
     * @return boolean
     */
    public boolean removeCatalog(Catalog catalog) {
        if (catalogs != null) {
            catalogs = getCatalogs();
            return catalogs.remove(catalog);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Catalog{" + "blogs=" + blogs + ", catalogs=" + catalogs + '}';
    }
}