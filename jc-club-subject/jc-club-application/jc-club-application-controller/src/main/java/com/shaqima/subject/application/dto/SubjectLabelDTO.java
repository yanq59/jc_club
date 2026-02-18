package com.shaqima.subject.application.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 题目标签DTO
 *
 * @Author : qi
 * @create 2026/2/14 18:12
 */
@Data
public class SubjectLabelDTO implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 分类id
     */
    private Long categoryId;
    /**
     * 标签分类
     */
    private String labelName;
    /**
     * 排序
     */
    private Integer sortNum;
}
