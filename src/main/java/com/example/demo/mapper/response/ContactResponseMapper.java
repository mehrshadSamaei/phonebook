package com.example.demo.mapper.response;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.contactdto.ContactRequestDTO;
import com.example.demo.dto.contactdto.ContactResponseDTO;
import com.example.demo.entity.Contact;
import org.mapstruct.Mapper;

@Mapper
public interface ContactResponseMapper extends BaseMapper<ContactRequestDTO,ContactResponseDTO, Contact, Long> {
}
