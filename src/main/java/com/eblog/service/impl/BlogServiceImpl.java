package com.eblog.service.impl;

import com.eblog.entity.Blog;
import com.eblog.repsotiroy.BlogRepository;
import com.eblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by teemper on 2018/3/18, 21:24.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@Component
public class BlogServiceImpl implements BlogService {

    private BlogRepository blogRepository;
//    public BlogRepository getBlogRepository() {
//        return blogRepository;
//    }

    @Autowired
    public void setBlogRepository(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public Blog getBlogByTitle(String title) {
        return blogRepository.getBlogByTitle(title);
    }
}
