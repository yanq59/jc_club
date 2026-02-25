package com.shaqima.subject.application.convert;

import com.shaqima.subject.application.dto.SubjectAnswerDTO;
import com.shaqima.subject.application.dto.SubjectInfoDTO;
import com.shaqima.subject.domain.entity.SubjectAnswerBO;
import com.shaqima.subject.domain.entity.SubjectInfoBO;
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
public interface SubjectAnswerDTOConverter {

     SubjectAnswerDTOConverter INSTANCE = Mappers.getMapper(SubjectAnswerDTOConverter.class);

     SubjectAnswerBO convertDTOToBO(SubjectAnswerDTO subjectAnswerDTO);

     List<SubjectAnswerBO> convertListDTOToBO(List<SubjectAnswerDTO> dtoList);
}
