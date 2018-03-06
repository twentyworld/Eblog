package com.eblog.blog;

import com.eblog.entity.Catalog;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BlogCreator Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 4, 2018</pre> 
* @version 1.0 
*/ 
public class BlogCreatorTest { 

    Logger logger = Logger.getLogger(BlogCreatorTest.class);
    private Catalog catalog;

    @Before
    public void before() throws Exception {

//        catalog = new BlogCreator().getCatalog();
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: getCatalog()
    *
    */
    @Test
    public void testGetCatalog() throws Exception {
        Assert.assertTrue(catalog.getAllBlogs().size()==10);
//        System.out.println(catalog.getAllBlogs().get(5).getContext());
        logger.info(catalog.getAllBlogs().get(5).getContext());
    }

} 
