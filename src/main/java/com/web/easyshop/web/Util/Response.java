package com.web.easyshop.web.Util;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

public class Response {

    public static <T>Object Success(Long code, String message, Object data)
    {
        HashMap m = new HashMap();
        m.put("code", code);
        m.put("message", message);
        m.put("data", data);

        return m;
    }

    public static <T>Object Success(Object data)
    {
        return Success(200L, "success", data);
    }

    public static <T>Object Success(String message, Object data)
    {
        return Success(200L, message, data);
    }

    public static <T>Object Success(String message)
    {
        return Success(200L, message, null);
    }

    public static <T>Object Success()
    {
        return Success(200L, "success", null);
    }

    public static <T>Object Error(Long code, String message, Object data)
    {
        HashMap m = new HashMap();
        m.put("code", code);
        m.put("message", message);
        m.put("data", data);

        return m;
    }

    public static <T>Object Error(Object data)
    {
        return Error(500L, "error", data);
    }

    public static <T>Object Error(Object data, String message)
    {
        return Error(500L, message, data);
    }

    public static <T>Object Error(Long code)
    {
        return Error(code, "error", null);
    }

    public static <T>Object Error(Long code, String message)
    {
        return Error(code, message, null);
    }
}
