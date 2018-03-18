package com.eblog.repsotiroy;


import com.eblog.entity.Blog;
import org.springframework.stereotype.Component;

/**
 * Created by teemper on 2018/3/4, 22:54.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */

@Component
public interface BlogRepository  {
    public Blog getBlogByTitle(String title);
}
