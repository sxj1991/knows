package com.xjsun.knows.base.util;

/**
 * 响应工具类
 * @param <T>
 */
public class Result<T> {
    private T data;
    private Integer code;
    private String errorMsg;

    public Result(T data) {
        this.data = data;
        this.code = 200;
    }

    public Result(Integer code, String errorMsg) {
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public static <T> Result<T> success() {
        return new Result<T>(null).setCode(200);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(data);
    }

    public static <T> Result<T> error(Integer code, String errorMsg) {
        return new Result<T>(code, errorMsg);
    }


    public T getData() {
        return data;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public Result<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public Result<T> setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }


    @Override
    public String toString() {
        return "Result{" +
                "data=" + data +
                ", code=" + code +
                ", errorMsg='" + errorMsg + '}';
    }


}
