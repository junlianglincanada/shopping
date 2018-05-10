package com.junlianglin.groupon.support;

import org.springframework.http.MediaType;

import java.nio.charset.Charset;
import java.util.Map;

public class AbstractController {
    public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));
    public static final MediaType APPLICATION_TEXT_UTF8 = new MediaType(MediaType.TEXT_HTML.getType(), MediaType.TEXT_HTML.getSubtype(), Charset.forName("utf8"));

    protected int getIntParam(Map paramMap, String key) {
        int paramValue;
        String value = paramMap.get(key)+"";
        try {
            paramValue = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            paramValue = Integer.MIN_VALUE;
        }
        return paramValue;
    }
}
