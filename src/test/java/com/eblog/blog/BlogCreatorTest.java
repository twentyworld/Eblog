package com.eblog.blog; 

import com.eblog.util.BlogCreator;
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

    BlogCreator blogCreator;

    Catalog catalog;
    @Before
    public void before() throws Exception {
        blogCreator = new BlogCreator();
        catalog = blogCreator.getCatalog();
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
    }

} 
