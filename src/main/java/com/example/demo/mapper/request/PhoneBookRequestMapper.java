package com.example.demo.mapper.request;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.phonebookdto.PhoneBookRequestDTO;
import com.example.demo.dto.phonebookdto.PhoneBookResponseDTO;
import com.example.demo.dto.root.PhoneBookRootDTO;
import com.example.demo.entity.PhoneBook;
import org.mapstruct.Mapper;

@Mapper
public interface PhoneBookRequestMapper extends BaseMapper< PhoneBookRequestDTO, PhoneBookResponseDTO, PhoneBook, Long> {
}
