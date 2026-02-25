package com.shaqima.subject.domain.handler.subject;

import com.shaqima.subject.common.enums.SubjectInfoTypeEnum;
import com.shaqima.subject.domain.entity.SubjectInfoBO;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : qi
 * @create 2026/2/24 18:01
 */
public interface SubjectTypeHandler {

    /**
     * 枚举身份识别
    * */
    SubjectInfoTypeEnum getHandlerType();

    /**
     * 实际题目插入
    * */
    void add(SubjectInfoBO subjectInfoBO);
}
