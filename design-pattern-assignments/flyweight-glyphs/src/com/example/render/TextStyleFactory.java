package com.example.render;

import java.util.Map;
import java.util.HashMap;

public class TextStyleFactory {
   

    private static final Map<String, TextStyle> cache = new HashMap<>();

    public static TextStyle getTextStyle(String font, int size, boolean bold) {
        String key = font + "|" + size + "|" + bold;
        return cache.computeIfAbsent(key, k -> new TextStyle(font, size, bold));
    }

}
