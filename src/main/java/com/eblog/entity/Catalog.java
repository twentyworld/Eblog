package com.eblog.entity;

import java.io.File;
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
    private User owner;
    private List<File> blogs;
    private List<Catalog> catalogs;

//    public Catalog(List<Blog> blogs, List<Catalog> catalogs) {
//        this.blogs = blogs;
//        this.catalogs = catalogs;
//    }

    public Catalog() {
        blogs = new CopyOnWriteArrayList<>();
        catalogs = new CopyOnWriteArrayList<>();
    }

    /**
     * get the list blog under this catalog.
     * @return list blog
     */
    public List<File> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<File> blogs) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    /**
     * add a blog element to the blog list
     * @param blog:
     * @return boolean
     */
    public boolean addBlog(File blog) {
        return blogs.add(blog);
    }

    /**
     * remove a blog element to the blog list
     * @param blog:
     * @return boolean
     */
    public boolean removeBlog(File blog) {
        return  blogs.remove(blog);
    }

    /**
     * add a catalog element to the catalog list
     * @param catalog :
     * @return boolean
     */
    public boolean addCatalog(Catalog catalog) {
        return catalogs.add(catalog);
    }

    /**
     * remove a catalog element to the catalog list
     * @param catalog:
     * @return boolean
     */
    public boolean removeCatalog(Catalog catalog) {
        return catalogs.remove(catalog);
    }


    public List<File> getAllBlogs() {

        List<File> allBlogDescription = new CopyOnWriteArrayList<>();
        allBlogDescription.addAll(blogs);

        for (Catalog catalog:catalogs) {
            allBlogDescription.addAll(catalog.getAllBlogs());
        }
        return allBlogDescription;
    }





    @Override
    public String toString() {
        return "Catalog{" + "blogs=" + blogs + ", catalogs=" + catalogs + '}';
    }
}