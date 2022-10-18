package com.example.demo.mapper.response;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.userdto.UserRequestDTO;
import com.example.demo.dto.userdto.UserResponseDTO;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserResponseMapper extends BaseMapper<UserRequestDTO, UserResponseDTO,User, Long> {
}
