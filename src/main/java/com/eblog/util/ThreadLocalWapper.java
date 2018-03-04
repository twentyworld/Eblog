package com.eblog.util;

/**
 * Created by teemper on 2018/3/4, 21:06.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class ThreadLocalWapper {
    ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public String getName() {
        return threadLocal.get();
    }


}
