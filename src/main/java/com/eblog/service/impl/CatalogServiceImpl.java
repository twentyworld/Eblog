package com.eblog.service.impl;

import com.eblog.entity.Catalog;
import com.eblog.entity.User;
import com.eblog.repsotiroy.CatalogRepository;
import com.eblog.repsotiroy.UserRepository;
import com.eblog.service.CatalogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by teemper on 2018/3/5, 23:13.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */

@Component
public class CatalogServiceImpl implements CatalogService{


    private Logger logger = LoggerFactory.getLogger(CatalogService.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    CatalogRepository catalogRepository;

    public Catalog getCatalogByUserId(long id) {

        User user = userRepository.findUserById(id);
        if (user==null) return new Catalog();

        logger.info(user.toString());

        if (user.getName().equals("teemper"))
            return catalogRepository.getCatalog();

        else
            return catalogRepository.getCatalogUnderFile("/blog"+user.getName());


    }




}
