package com.example.demo.mapper.root;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.root.UserRootDTO;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserRootMapper extends BaseMapper<UserRootDTO , User, Long> {
}
