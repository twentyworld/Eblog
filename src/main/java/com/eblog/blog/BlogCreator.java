package com.eblog.blog;

import com.eblog.entity.Blog;
import com.eblog.util.FileToCatelogConversion;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by teemper on 2018/3/4, 20:31.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */
@Component
public class BlogCreator {

    private String blogLocation ="/blog";

    public BlogCreator() {

    }

    public BlogCreator(String blogLocation) {
        this.blogLocation = blogLocation;
    }

    public Catalog getCatalog() {
        try {
            File file = new ClassPathResource(blogLocation).getFile();
            return getCatalogUnderFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Catalog();
    }

    public Catalog getCatalogUnderFile(File file) {
        return FileToCatelogConversion.convert(file);
    }






}
