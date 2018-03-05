package com.eblog.controller;

import com.eblog.entity.Catalog;
import com.eblog.service.CatalogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teemper on 2018/3/5, 22:19.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@RestController
public class CatalogController {

    private Logger logger = LoggerFactory.getLogger(CatalogController.class);
    @Autowired
    CatalogService catalogService;

    @GetMapping("/catalog/{id}")
    public Catalog getCatalogByUserId(@PathVariable("id")long id) {
        logger.info("id:"+id);
        return catalogService.getCatalogByUserId(id);
    }

}
