package com.eblog;

import com.eblog.entity.User;
import com.eblog.repsotiroy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by teemper on 2018/3/4, 19:51.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */

@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }


    @Autowired
    UserRepository repository;
    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {

        User blogUser = new User(3,"teemper","teemper","17621762488",true,"teemper@163.com");
        repository.save(blogUser);
        System.out.println(repository.findAll());
    }
}
