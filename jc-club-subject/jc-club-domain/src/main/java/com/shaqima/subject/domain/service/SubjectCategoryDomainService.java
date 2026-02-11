package com.shaqima.subject.domain.service;

import com.shaqima.subject.domain.entity.SubjectCategoryBO;
import com.shaqima.subject.infra.basic.entity.SubjectCategory;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : qi
 * @create 2026/2/4 14:15
 */
public interface SubjectCategoryDomainService {

    void add(SubjectCategoryBO subjectCategoryBO);
/**
    * 查询岗位大类
 * */
    List<SubjectCategoryBO> queryCategory(SubjectCategoryBO subjectCategoryBO);
}
