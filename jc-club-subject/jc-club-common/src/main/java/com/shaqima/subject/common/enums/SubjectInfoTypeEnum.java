package com.shaqima.subject.common.enums;

import lombok.Getter;

/**
 * 题目信息类型枚举
 *
 * @Author : qi
 * @create 2026/2/11 19:04
 */
@Getter
public enum SubjectInfoTypeEnum {
    RADIO(1, "单选题"),
    MULTIPLE(2, "多选题"),
    JUDGE(3, "判断题"),
    BRIEF(4, "简答题");

    private final int code;
    private final String description;

    SubjectInfoTypeEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static SubjectInfoTypeEnum getByCode(int codeVal){
        for (SubjectInfoTypeEnum subjectInfoTypeEnum:SubjectInfoTypeEnum.values()){
            if (subjectInfoTypeEnum.code == codeVal){
                return subjectInfoTypeEnum;
            }

        }
        return null;
    }
}
