package com.shaqima.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 题目标签BO
 *
 * @Author : qi
 * @create 2026/2/14 18:12
 */
@Data
public class SubjectLabelBO implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 标签分类
     */
    private String labelName;
    /**
     * 排序
     */
    private Integer sortNum;
    /**
     * 分类id
     */
    private Long categoryId;
}
