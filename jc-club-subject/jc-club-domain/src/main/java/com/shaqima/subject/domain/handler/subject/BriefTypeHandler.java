package com.shaqima.subject.domain.handler.subject;

import com.shaqima.subject.common.enums.SubjectInfoTypeEnum;
import com.shaqima.subject.domain.entity.SubjectInfoBO;
import org.springframework.stereotype.Component;

/**
 * 简答策略类
 *
 * @Author : qi
 * @create 2026/2/24 18:05
 */
@Component
public class BriefTypeHandler implements SubjectTypeHandler {
    @Override
    public SubjectInfoTypeEnum getHandlerType() {
        return SubjectInfoTypeEnum.BRIEF;
    }

    @Override
    public void add(SubjectInfoBO subjectInfoBO) {

    }
}
