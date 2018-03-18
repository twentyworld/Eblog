package com.eblog.repsotiroy.impl;

import com.eblog.entity.Blog;
import com.eblog.entity.User;
import com.eblog.repsotiroy.BlogRepository;
import com.eblog.repsotiroy.CatalogRepository;
import com.eblog.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * Created by teemper on 2018/3/5, 22:53.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@Component
public class BlogRepositoryImpl implements BlogRepository {


    private CatalogRepository catalogRepository;

//    public CatalogRepository getCatalogRepository() {
//        return catalogRepository;
//    }

    @Autowired
    public void setCatalogRepository(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public BlogRepositoryImpl() {

    }

    @Override
    public Blog getBlogByTitle(String title) {
        //Blog blog = new Blog();
        List<File> blogs = catalogRepository.getCatalog().getBlogs();

        for (File file: blogs) {
            if (file.getName().equals(title)) {

                String content = FileUtil.readFile(file);
                Date modifiedDate = new Date(file.lastModified());
                String synopsis = FileUtil.getBlogDescription(content);
                User author = new User();

                return new Blog(title,synopsis,modifiedDate,author,content,false,true);

            }
        }
        return null;

    }
}
