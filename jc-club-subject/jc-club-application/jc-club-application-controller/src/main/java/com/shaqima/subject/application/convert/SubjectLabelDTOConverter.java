package com.shaqima.subject.application.convert;

import com.shaqima.subject.application.dto.SubjectLabelDTO;
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
public interface SubjectLabelDTOConverter {

     SubjectLabelDTOConverter INSTANCE = Mappers.getMapper(SubjectLabelDTOConverter.class);

     SubjectLabelBO convertDTOToLabelBO(SubjectLabelDTO subjectLabelDTO);

     List<SubjectLabelDTO> convertBOToLabelDTOList(List<SubjectLabelBO> boList);

}
