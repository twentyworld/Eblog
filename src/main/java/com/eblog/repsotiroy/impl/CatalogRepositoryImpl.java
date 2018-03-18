package com.eblog.repsotiroy.impl;

import com.eblog.entity.Blog;
import com.eblog.entity.User;
import com.eblog.entity.Catalog;
import com.eblog.repsotiroy.CatalogRepository;
import com.eblog.repsotiroy.UserRepository;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Created by teemper on 2018/3/5, 22:35.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */

@Component
public class CatalogRepositoryImpl implements CatalogRepository {

    Logger logger = LoggerFactory.getLogger(CatalogRepositoryImpl.class);

    @Value("${eblog.blog.location}")
    private String blogLocation;

    @Autowired
    private UserRepository userRepository;
//
//    @Autowired
//    public CatalogFactory(UserRepository userRepository) {
//        this(blogLocation,userRepository);
//    }
//
//    public CatalogFactory(String blogLocation,UserRepository userRepository) {
//        this.blogLocation = blogLocation;
//    }
//


    public Catalog getCatalog() {
        logger.info("getCatalog invoking. and the blog location is in: " + blogLocation);

        return getCatalogUnderFile(blogLocation);

    }

    public Catalog getCatalogUnderFile(String path) {
        File file = null;
        try {
            file = new ClassPathResource(path).getFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return convert(file);
    }


    private Catalog convert(File root) {
        Catalog catalog = new Catalog();

        File[] files = root.listFiles();
        if (files == null || files.length == 0) return new Catalog();

        for (File file : files) {
            if (file.isDirectory()) catalog.addCatalog(convert(file));
            else if (file.isFile()) {
                catalog.addBlog(file);
            } else return new Catalog();
        }
        return catalog;

    }

//    @NotNull
//    private  Blog fileToBlog(File file) {
//        if (file == null) return new Blog();
//
//        String title = file.getName();
//
//        Date date = new Date(file.lastModified());
//        User author = userRepository.findUserById(1);
//        String context = readFile(file);
//        String description  = getBlogDescription(context);
//
//        return  new Blog(title, date, author, context, false,description);
//
//    }
//
//    private  String getBlogDescription(String context) {
//        if (context.contains("---"))
//            return firstParagraph(context.split("---")[1].split("\n"));
//        else if (context.contains("----"))
//            return firstParagraph(context.split("----")[1].split("\n"));
//        else return context;
//    }
//
//
//    @Contract("null -> null")
//    private  String firstParagraph(String[] lines) {
//        if (lines == null) return null;
//        for (String string :lines) {
//            if (string ==null || string.trim().isEmpty()) continue;
//            if (string.startsWith("#")|| string.startsWith("-")) continue;
//            return string;
//        }
//        return null;
//    }
//
//    @Nullable
//    public static String readFile(File file) {
//
//        String encoding = "UTF-8";
//
//        Long fileLength = file.length();
//        byte[] fileContent = new byte[fileLength.intValue()];
//        try {
//            FileInputStream in = new FileInputStream(file);
//            in.read(fileContent);
//            in.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            return new String(fileContent, encoding);
//        } catch (UnsupportedEncodingException e) {
//            System.err.println("The OS does not support " + encoding);
//            e.printStackTrace();
//            return null;
//        }
//    }

}
