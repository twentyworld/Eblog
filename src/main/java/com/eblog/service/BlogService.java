package com.eblog.service;

import com.eblog.entity.Blog;
import com.eblog.repsotiroy.BlogRepository;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by teemper on 2018/3/4, 20:22.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */

@Service
public interface BlogService {

    public Blog getBlogByTitle(String title);
}
