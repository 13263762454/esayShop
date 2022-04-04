package com.web.easyshop.web.Enum;

public enum ResultCodeEnum {

    SUCCESS(200, "成功"),
    ERROR(500, "失败");

    ResultCodeEnum(Integer code, String message) {
        this.code    = code;
        this.message = message;
    }

    private final Integer code;

    private final String message;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

}