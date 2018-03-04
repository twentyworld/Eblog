package com.eblog.util;

import com.eblog.blog.Catalog;
import com.eblog.entity.Blog;
import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Created by teemper on 2018/3/4, 20:31.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */
@Component
public class BlogCreator {

    Logger logger = Logger.getLogger(BlogCreator.class);
    private String blogLocation = "/blog";

    public BlogCreator() {

    }

    public BlogCreator(String blogLocation) {
        this.blogLocation = blogLocation;
    }


    public Catalog getCatalog() {
        logger.info("getCatalog invoking.");
        try {
            File file = new ClassPathResource(blogLocation).getFile();
            return getCatalogUnderFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Catalog();
    }

    public Catalog getCatalogUnderFile(File file) {
        return convert(file);
    }


    private Catalog convert(File root) {
        Catalog catalog = new Catalog();

        File[] files = root.listFiles();
        if (files == null || files.length == 0) return new Catalog();

        for (File file : files) {
            if (file.isDirectory()) catalog.addCatalog(convert(file));
            else if (file.isFile()) {
                Blog blog = fileToBlog(file);
                catalog.addBlog(blog);
            } else return new Catalog();
        }

        return catalog;

    }

    private static Blog fileToBlog(File file) {
        if (file == null) return new Blog();

        String title = file.getName();
        Date date = new Date(System.currentTimeMillis());
        String author = "teemper";
        String context = readFile(file);

        return  new Blog(title, date, author, context, false);

    }

    private static String readFile(File file) {

//        StringBuilder stringBuilder = new StringBuilder();
//        if (file.isFile() && file.exists()) {
//            try {
//                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//                String line;
//                while ((line = bufferedReader.readLine()) != null) {
//                    stringBuilder.append(line + "\n");
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return stringBuilder.toString();

        String encoding = "UTF-8";

        Long fileLength = file.length();
        byte[] fileContent = new byte[fileLength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(fileContent);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(fileContent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }

}
