package com.shaqima.subject.domain.convert;


import com.shaqima.subject.domain.entity.SubjectLabelBO;
import com.shaqima.subject.infra.basic.entity.SubjectLabel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


/**
 * Created by IntelliJ IDEA.
 *
 * @Author : qi
 * @create 2026/2/4 15:07
 */
@Mapper
public interface SubjectLabelConverter {
    SubjectLabelConverter INSTANCE = Mappers.getMapper(SubjectLabelConverter.class);

    SubjectLabel convertBoToLabel(SubjectLabelBO subjectLabelBO);

}
