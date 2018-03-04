package com.eblog.blog; 

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

    @Before
    public void before() throws Exception {
        blogCreator = new BlogCreator();
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

        System.out.println(blogCreator.getCatalog().toString());
    }

} 
