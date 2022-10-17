package com.example.demo.service.impl;

import com.example.demo.base.BaseServiceImpl;
import com.example.demo.dto.root.UserRootDTO;
import com.example.demo.entity.User;
import com.example.demo.mapper.root.UserRootMapper;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl extends BaseServiceImpl<User, UserRootDTO , Long , UserRootMapper, UserRepository>
implements UserService {
    @Autowired
    public UserServiceImpl(UserRepository repository, UserRootMapper mapper) {
        super(repository, mapper);
    }
}
