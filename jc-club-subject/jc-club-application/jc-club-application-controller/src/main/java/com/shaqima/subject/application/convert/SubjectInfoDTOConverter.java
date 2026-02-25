package com.shaqima.subject.application.convert;

import com.shaqima.subject.application.dto.SubjectInfoDTO;
import com.shaqima.subject.application.dto.SubjectLabelDTO;
import com.shaqima.subject.domain.entity.SubjectInfoBO;
import com.shaqima.subject.domain.entity.SubjectLabelBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 标签dto的转换.
 *
 * @Author : qi
 * @create 2026/2/14 18:18
 */
@Mapper
public interface SubjectInfoDTOConverter {

     SubjectInfoDTOConverter INSTANCE = Mappers.getMapper(SubjectInfoDTOConverter.class);

     SubjectInfoBO convertDTOToBO(SubjectInfoDTO subjectInfoDTO);

}
