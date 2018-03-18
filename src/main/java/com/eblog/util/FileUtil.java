package com.eblog.util;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by teemper on 2018/3/18, 19:06.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class FileUtil {


    public static String getBlogDescription(String context) {
        if (context.contains("---")) return firstParagraph(context.split("---")[1].split("\n"));
        else if (context.contains("----")) return firstParagraph(context.split("----")[1].split("\n"));
        else return context;
    }


    @Contract("null -> null")
    public static String firstParagraph(String[] lines) {
        if (lines == null) return null;
        for (String string : lines) {
            if (string == null || string.trim().isEmpty()) continue;
            if (string.startsWith("#") || string.startsWith("-")) continue;
            return string;
        }
        return "does not contain any description.";
    }

    @Nullable
    public static String readFile(File file) {

        String encoding = "UTF-8";

        Long fileLength = file.length();
        byte[] fileContent = new byte[fileLength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(fileContent);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(fileContent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }

}
