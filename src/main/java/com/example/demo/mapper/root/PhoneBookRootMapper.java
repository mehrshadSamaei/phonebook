package com.example.demo.mapper.root;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.root.ContactRootDTO;
import com.example.demo.dto.root.PhoneBookRootDTO;
import com.example.demo.entity.Contact;
import com.example.demo.entity.PhoneBook;
import org.mapstruct.Mapper;

@Mapper
public interface PhoneBookRootMapper extends BaseMapper<PhoneBookRootDTO, PhoneBook, Long> {
}
