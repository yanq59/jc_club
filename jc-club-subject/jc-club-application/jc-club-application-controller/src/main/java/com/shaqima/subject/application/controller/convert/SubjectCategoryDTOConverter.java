package com.shaqima.subject.application.controller.convert;

import com.shaqima.subject.application.controller.dto.SubjectCategoryDTO;
import com.shaqima.subject.domain.entity.SubjectCategoryBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : qi
 * @create 2026/2/4 15:07
 */
@Mapper
public interface SubjectCategoryDTOConverter {
    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);

    SubjectCategoryBO convertBoToCategory(SubjectCategoryDTO subjectCategoryDTO);

    List<SubjectCategoryDTO> convertBoToCategoryDTOList(List<SubjectCategoryBO>  boList);
}
