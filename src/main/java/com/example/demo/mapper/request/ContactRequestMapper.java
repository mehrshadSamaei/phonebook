package com.example.demo.mapper.request;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.contactdto.ContactRequestDTO;
import com.example.demo.dto.root.ContactRootDTO;
import com.example.demo.entity.Contact;
import org.mapstruct.Mapper;

@Mapper
public interface ContactRequestMapper extends BaseMapper<ContactRequestDTO, Contact, Long> {
}
