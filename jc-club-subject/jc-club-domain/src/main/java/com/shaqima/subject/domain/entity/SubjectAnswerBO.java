package com.shaqima.subject.domain.entity;

import lombok.Data;

/**
 * 题目答案DTO
 *
 * @Author : qi
 * @create 2026/2/19 0:05
 */
@Data
public class SubjectAnswerBO {
    /**
     * 答案选项标识 1单选 2多选 3判断 4简答
     */
    private Integer optionType;
    /**
     * 答案内容
     */
    private String optionContent;
    /**
     * 是否正确 1正确 0错误
     */
    private Integer isCorrect;
}
