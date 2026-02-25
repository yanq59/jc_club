package com.shaqima.subject.domain.handler.subject;

import com.shaqima.subject.common.enums.SubjectInfoTypeEnum;
import com.shaqima.subject.domain.entity.SubjectInfoBO;
import org.springframework.stereotype.Component;

/**
 * 多选题目策略类
 *
 * @Author : qi
 * @create 2026/2/24 18:05
 */
@Component
public class MultipleTypeHandler implements SubjectTypeHandler {
    @Override
    public SubjectInfoTypeEnum getHandlerType() {
        return SubjectInfoTypeEnum.MULTIPLE;
    }

    @Override
    public void add(SubjectInfoBO subjectInfoBO) {

    }
}
