package com.shaqima.subject.domain.convert;

import com.shaqima.subject.domain.entity.SubjectCategoryBO;
import com.shaqima.subject.infra.basic.entity.SubjectCategory;
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
public interface SubjectCategoryConverter {
    SubjectCategoryConverter INSTANCE = Mappers.getMapper(SubjectCategoryConverter.class);
    SubjectCategory convertBoToCategory(SubjectCategoryBO subjectCategoryBO);

    List<SubjectCategoryBO> convertBoToCategory(List<SubjectCategory> categoryList);
}
