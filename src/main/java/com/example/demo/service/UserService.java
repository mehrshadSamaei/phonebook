package com.example.demo.service;

import com.example.demo.base.BaseService;
import com.example.demo.dto.search.UserSearch;
import com.example.demo.dto.userdto.UserRequestDTO;
import com.example.demo.dto.userdto.UserResponseDTO;

import java.util.List;

public interface UserService extends BaseService<UserResponseDTO, UserRequestDTO, Long> {
    List<UserResponseDTO> findAllByAdvanceSearch(UserSearch userSearch);
}
