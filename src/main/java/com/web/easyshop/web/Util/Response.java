package com.web.easyshop.web.Util;

import com.web.easyshop.web.Enum.ResultCodeEnum;
import lombok.Data;

import java.util.HashMap;

@Data
public class Response {

    public static <T>Object Success(Integer code, String message, Object data)
    {
        HashMap<String, Object> m = new HashMap<String, Object>();
        m.put("code", code);
        m.put("message", message);
        m.put("data", data);

        return m;
    }

    public static <T>Object Success(ResultCodeEnum resultCodeEnum, Object data) {
        return Success(resultCodeEnum.getCode(), resultCodeEnum.getMessage(), data);
    }

    public static <T>Object Success(Object data)
    {
        return Success(ResultCodeEnum.SUCCESS, data);
    }

    public static <T>Object Success(String message)
    {
        return Success(ResultCodeEnum.SUCCESS.getCode(), message, null);
    }

    public static <T>Object Success(String message, Object data)
    {
        return Success(ResultCodeEnum.SUCCESS.getCode(), message, data);
    }

    public static <T>Object Success()
    {
        return Success(ResultCodeEnum.SUCCESS, null);
    }

    public static <T>Object Error(Integer code, String message, Object data)
    {
        HashMap<String, Object> m = new HashMap<String, Object>();
        m.put("code", code);
        m.put("message", message);
        m.put("data", data);

        return m;
    }

    public static <T>Object Error(ResultCodeEnum resultCodeEnum, Object data) {
        return Error(resultCodeEnum.getCode(), resultCodeEnum.getMessage(), data);
    }

    public static <T>Object Error(Object data)
    {
        return Error(ResultCodeEnum.ERROR, data);
    }

    public static <T>Object Error(String message)
    {
        return Error(ResultCodeEnum.ERROR.getCode(), message, null);
    }

    public static <T>Object Error(String message, Object data)
    {
        return Success(ResultCodeEnum.ERROR.getCode(), message, data);
    }

    public static <T>Object Error()
    {
        return Success(ResultCodeEnum.ERROR, null);
    }

}
