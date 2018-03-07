package com.eblog.util.MarkDownTransfer; 

import com.eblog.repsotiroy.impl.BlogRepositoryImpl;
import com.eblog.repsotiroy.impl.CatalogRepositoryImpl;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.core.io.ClassPathResource;

import java.io.File;

/** 
* MarkDown2HtmlWapper Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 7, 2018</pre> 
* @version 1.0 
*/ 
public class MarkDown2HtmlWapperTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: ofFile(String string) 
* 
*/ 
@Test
public void testOfFile() throws Exception {


    File file = new ClassPathResource("blog/notes/JDK/CountDownLatch").getFile();
    MarkDownEntity html = MarkDown2HtmlWapper.ofFile(CatalogRepositoryImpl.readFile(file));

    System.out.println(html.toString());

} 

/** 
* 
* Method: ofContent(String content) 
* 
*/ 
@Test
public void testOfContent() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: parse(String content) 
* 
*/ 
@Test
public void testParse() throws Exception { 
//TODO: Test goes here... 
} 


} 
