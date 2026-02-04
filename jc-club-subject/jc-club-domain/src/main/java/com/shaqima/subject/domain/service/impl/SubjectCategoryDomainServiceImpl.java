package com.shaqima.subject.domain.service.impl;

import com.alibaba.fastjson.JSON;
import com.shaqima.subject.domain.convert.SubjectCategoryConverter;
import com.shaqima.subject.domain.entity.SubjectCategoryBO;
import com.shaqima.subject.domain.service.SubjectCategoryDomainService;
import com.shaqima.subject.infra.basic.entity.SubjectCategory;
import com.shaqima.subject.infra.basic.service.SubjectCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : qi
 * @create 2026/2/4 14:16
 */
@Service
@Slf4j
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainService {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    @Override
    public void add(SubjectCategoryBO subjectCategoryBO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectCategoryController add subjectCategoryBO: {}", JSON.toJSONString(subjectCategoryBO));

        }
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE.convertBoToCategory(subjectCategoryBO);
        subjectCategoryService.insert(subjectCategory);
    }
}
