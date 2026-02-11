package com.shaqima.subject.common.enums;

import lombok.Getter;

/**
 * 分类类型枚举.
 *
 * @Author : qi
 * @create 2026/2/11 19:04
 */
@Getter
public enum CategroyTypeEnum {
    PRIMARY(1, "岗位大类"),
    SECOND(2, "二级分类");

    private final Integer code;
    private final String message;

    CategroyTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public static CategroyTypeEnum getByCode(int codeVal){
        for (CategroyTypeEnum resultCodeEnum:CategroyTypeEnum.values()){
            if (resultCodeEnum.code == codeVal){
                return resultCodeEnum;
            }

        }
        return null;
    }
}
