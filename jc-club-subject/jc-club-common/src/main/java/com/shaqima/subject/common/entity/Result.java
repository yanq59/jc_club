package com.shaqima.subject.common.entity;

import com.shaqima.subject.common.enums.ResultCodeEnum;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : qi
 * @create 2026/2/4 15:42
 */
@Data
public class Result<T> {

    private Boolean success;

    private Integer code;

    private String message;

    private T data;

    public static Result ok() {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return result;
    }

    public static <T> Result ok(T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        result.setData(data);
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResultCodeEnum.FAILURE.getCode());
        result.setMessage(ResultCodeEnum.FAILURE.getMessage());
        return result;
    }

    public static <T> Result fail(T data) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResultCodeEnum.FAILURE.getCode());
        result.setMessage(ResultCodeEnum.FAILURE.getMessage());
        result.setData(data);
        return result;
    }
}
