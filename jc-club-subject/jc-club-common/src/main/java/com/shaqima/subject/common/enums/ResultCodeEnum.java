package com.shaqima.subject.common.enums;

import lombok.Getter;

/**
* Created by IntelliJ IDEA.
* @Author : qi
* @create 2026/2/4 15:46
*/
@Getter
public enum ResultCodeEnum {

    SUCCESS(200, "成功"),
    FAILURE(500, "失败");

    public int  code;
    public String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResultCodeEnum getByCode(int codeVal){
        for (ResultCodeEnum resultCodeEnum:ResultCodeEnum.values()){
            if (resultCodeEnum.code == codeVal){
                return resultCodeEnum;
            }

        }
        return null;
    }
}
