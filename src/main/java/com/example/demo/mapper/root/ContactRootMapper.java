package com.example.demo.mapper.root;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.root.ContactRootDTO;
import com.example.demo.dto.root.UserRootDTO;
import com.example.demo.entity.Contact;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface ContactRootMapper extends BaseMapper<ContactRootDTO, Contact, Long> {
}
