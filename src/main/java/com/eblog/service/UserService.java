package com.eblog.service;

import com.eblog.entity.User;
import com.eblog.repsotiroy.BlogRepository;
import com.eblog.repsotiroy.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by teemper on 2018/3/4, 20:22.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */

@Service
public class UserService implements InitializingBean {
    @Autowired
    private UserRepository repository;



    public User getUserById(long id) {
        return repository.findUserById(id);
    }

    public List<User> getAllUser() {
        return repository.findAllUser();
    }


    /**
     * Invoked by a BeanFactory after it has set all bean properties supplied
     * (and satisfied BeanFactoryAware and ApplicationContextAware).
     * <p>This method allows the bean instance to perform initialization only
     * possible when all bean properties have been set and to throw an
     * exception in the event of misconfiguration.
     *
     * @throws Exception in the event of misconfiguration (such
     *                   as failure to set an essential property) or if initialization fails.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.isTrue(repository!=null);
    }
}
