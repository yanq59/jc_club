package com.shaqima.subject.common.enums;

import lombok.Getter;

/**
 * 删除状态枚举
 *
 * @Author : qi
 * @create 2026/2/11 18:48
 */
@Getter
public enum IsDeletedFlagEnum {

    UN_DELETED(0, "未删除"),
    DELETED(1, "已删除");

    private final Integer code;
    private final String message;

    IsDeletedFlagEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static IsDeletedFlagEnum getByCode(int codeVal){
        for (IsDeletedFlagEnum resultCodeEnum:IsDeletedFlagEnum.values()){
            if (resultCodeEnum.code == codeVal){
                return resultCodeEnum;
            }

        }
        return null;
    }

}
