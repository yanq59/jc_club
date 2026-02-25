package com.shaqima.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.shaqima.subject.application.convert.SubjectAnswerDTOConverter;
import com.shaqima.subject.application.convert.SubjectCategoryDTOConverter;
import com.shaqima.subject.application.convert.SubjectInfoDTOConverter;
import com.shaqima.subject.application.dto.SubjectCategoryDTO;
import com.shaqima.subject.application.dto.SubjectInfoDTO;
import com.shaqima.subject.common.entity.Result;
import com.shaqima.subject.domain.entity.SubjectAnswerBO;
import com.shaqima.subject.domain.entity.SubjectCategoryBO;
import com.shaqima.subject.domain.entity.SubjectInfoBO;
import com.shaqima.subject.domain.service.SubjectCategoryDomainService;
import com.shaqima.subject.domain.service.SubjectInfoDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 刷题controller
 *
 * @Author : qi
 * @create 2025/12/14 23:31
 */
@RestController
@RequestMapping("/subject")
@Slf4j
public class SubjectController {

    @Resource
    private SubjectInfoDomainService subjectInfoDomainService;

    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectInfoDTO subjectInfoDTO){
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectController add SubjectInfoDTO: {}",
                        JSON.toJSONString(subjectInfoDTO));

            }
//          断言
            Preconditions.checkNotNull(subjectInfoDTO.getSubjectName(), "题目名称不能为空");
            Preconditions.checkNotNull(subjectInfoDTO.getSubjectDifficult(), "题目难度不能为空");
            Preconditions.checkNotNull(subjectInfoDTO.getSubjectType(), "题目类型不能为空");
            Preconditions.checkNotNull(subjectInfoDTO.getSubjectScore(), "题目分数不能为空");
            Preconditions.checkNotNull(subjectInfoDTO.getCategoryIds(), "分类id不能为空");
            Preconditions.checkNotNull(subjectInfoDTO.getLabelIds(), "标签id不能为空");

            SubjectInfoBO subjectInfoBO = SubjectInfoDTOConverter.INSTANCE.
                    convertDTOToBO(subjectInfoDTO);

            List<SubjectAnswerBO> subjectAnswerBOS = SubjectAnswerDTOConverter.INSTANCE.
                    convertListDTOToBO(subjectInfoDTO.getOptionList());
            subjectInfoBO.setOptionList(subjectAnswerBOS);

            subjectInfoDomainService.add(subjectInfoBO);
            return Result.ok(true);
        } catch (Exception e) {
            log.error("SubjectController add error: {}", e.getMessage(), e);
            return Result.fail("添加题目失败");
        }

    }
}
