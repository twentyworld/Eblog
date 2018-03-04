package com.eblog.repsotiroy;

import com.eblog.entity.User;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by teemper on 2018/3/4, 20:02.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */
public interface UserRepository extends Repository<User, Long> {
    User findUserById(long id);
    List<User> findAllUser();
    User save(User user);
    long count();

    boolean existsById(String id);
    User delete(User user);
    User deleteById(String id);
    User deleteByName(String name);
    User deleteByEmail(String email);
}
