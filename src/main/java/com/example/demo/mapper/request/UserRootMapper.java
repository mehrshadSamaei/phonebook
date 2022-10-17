package com.example.demo.mapper.request;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.root.UserRootDTO;
import com.example.demo.dto.userdto.UserRequestDTO;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserRootMapper extends BaseMapper<UserRequestDTO, User, Long> {
}
