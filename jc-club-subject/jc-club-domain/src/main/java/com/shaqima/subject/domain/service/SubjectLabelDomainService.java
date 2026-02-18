package com.shaqima.subject.domain.service;

import com.shaqima.subject.domain.entity.SubjectCategoryBO;
import com.shaqima.subject.domain.entity.SubjectLabelBO;

import java.util.List;

/**
 * 题目标签领域服务.
 *
 * @Author : qi
 * @create 2026/2/4 14:15
 */
public interface SubjectLabelDomainService {

    /**
     * 新增标签
    * */
    boolean add(SubjectLabelBO subjectLabelBO);

    /**
     * 更新标签
     * */
    boolean update(SubjectLabelBO subjectLabelBO);
    /**
     * 删除标签
     * */
    boolean delete(SubjectLabelBO subjectLabelBO);

    /**
    * 查询分类下标签
    * */
    List<SubjectLabelBO> queryLabelByCategoryId(SubjectLabelBO subjectLabelBO);
}
