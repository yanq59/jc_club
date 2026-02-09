package com.shaqima.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.mysql.cj.util.StringUtils;
import com.shaqima.subject.application.controller.convert.SubjectCategoryDTOConverter;
import com.shaqima.subject.application.controller.dto.SubjectCategoryDTO;
import com.shaqima.subject.common.entity.Result;
import com.shaqima.subject.domain.entity.SubjectCategoryBO;
import com.shaqima.subject.domain.service.SubjectCategoryDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.security.auth.Subject;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : qi
 * @create 2026/2/4 15:13
 */
@RestController
@RequestMapping("/subject/category")
@Slf4j
public class SubjectCategoryController {
    @Resource
    private SubjectCategoryDomainService subjectCategoryDomainService;

    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectCategoryDTO subjectCategoryDTO){
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectCategoryController add subjectCategoryDTO: {}",
                        JSON.toJSONString(subjectCategoryDTO));

            }
//          断言
            Preconditions.checkNotNull(subjectCategoryDTO.getCategoryType(), "分类类型不能为空");
            Preconditions.checkNotNull(subjectCategoryDTO.getCategoryName(), "分类名称不能为空");
            Preconditions.checkNotNull(subjectCategoryDTO.getParentId(), "分类父级不能为空");

            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.
                    convertBoToCategory(subjectCategoryDTO);
            subjectCategoryDomainService.add(subjectCategoryBO);
            return Result.ok(true);
        } catch (Exception e) {
            log.error("SubjectCategoryController add error: {}", e.getMessage(), e);
            return Result.fail(e.getMessage());
        }

    }

    @PostMapping("/queryPrimaryCategory")
    public Result<List<SubjectCategoryDTO>> queryPrimaryCategory(){
        try {
            SubjectCategoryBO subjectCategoryBO = new SubjectCategoryBO();
            List<SubjectCategoryBO> subjectCategoryBOList = subjectCategoryDomainService.queryCategory(subjectCategoryBO);
            List<SubjectCategoryDTO> subjectCategoryDTOList = SubjectCategoryDTOConverter.INSTANCE.
                    convertBoToCategoryDTOList( subjectCategoryBOList);

            return Result.ok(subjectCategoryDTOList);
        }catch (Exception e){
            log.error("SubjectCategoryController queryPrimaryCategory error: {}", e.getMessage(), e);
            return Result.fail(e.getMessage());
        }

    }

    @PostMapping("/queryCategoryByPrimary")
    public Result<List<SubjectCategoryDTO>> queryCategoryByPrimary(@RequestBody SubjectCategoryDTO subjectCategoryDTO){
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectCategoryController queryCategoryByPrimary subjectCategoryDTO: {}",
                        JSON.toJSONString(subjectCategoryDTO));

            }
            Preconditions.checkNotNull(subjectCategoryDTO.getParentId(), "父级分类ID不能为空");

            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.
                    convertDTOToCategoryBO(subjectCategoryDTO);

            List<SubjectCategoryBO> subjectCategoryBOList = subjectCategoryDomainService.queryCategory(subjectCategoryBO);
            List<SubjectCategoryDTO> subjectCategoryDTOList = SubjectCategoryDTOConverter.INSTANCE.
                    convertBoToCategoryDTOList( subjectCategoryBOList);

            return Result.ok(subjectCategoryDTOList);
        }catch (Exception e){
            log.error("SubjectCategoryController queryPrimaryCategory error: {}", e.getMessage(), e);
            return Result.fail(e.getMessage());
        }

    }
}
