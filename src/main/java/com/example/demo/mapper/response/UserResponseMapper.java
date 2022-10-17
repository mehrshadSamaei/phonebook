package com.example.demo.mapper.response;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.root.UserRootDTO;
import com.example.demo.dto.userdto.UserResponseDTO;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserResponseMapper extends BaseMapper<UserResponseDTO, User, Long> {
}
