package com.example.demo.mapper.request;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.phonebookdto.PhoneBookRequestDTO;
import com.example.demo.dto.userdto.UserRequestDTO;
import com.example.demo.entity.PhoneBook;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserRequestMapper extends BaseMapper<UserRequestDTO, User, Long> {
}
