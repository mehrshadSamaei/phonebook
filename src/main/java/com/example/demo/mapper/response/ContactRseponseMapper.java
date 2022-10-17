package com.example.demo.mapper.response;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.contactdto.ContactResponseDTO;
import com.example.demo.dto.root.ContactRootDTO;
import com.example.demo.entity.Contact;
import org.mapstruct.Mapper;

@Mapper
public interface ContactRseponseMapper extends BaseMapper<ContactResponseDTO, Contact, Long> {
}
