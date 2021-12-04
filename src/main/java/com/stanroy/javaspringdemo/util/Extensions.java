package com.stanroy.javaspringdemo.util;

public class Extensions {


    public static String toSlug(String in) {
        if (in == null) {
            in = "";
        }
        return in.replaceAll("\\s+", "");
    }

}
