package com.example.demo.service.impl;

import com.example.demo.base.BaseServiceImpl;
import com.example.demo.dto.root.ContactRootDTO;
import com.example.demo.dto.root.GitHubRootDTO;
import com.example.demo.entity.Contact;
import com.example.demo.entity.Github;
import com.example.demo.mapper.root.ContactRootMapper;
import com.example.demo.mapper.root.GithubRootMapper;
import com.example.demo.repository.ContactRepository;
import com.example.demo.repository.GithubRepository;
import com.example.demo.service.ContactService;
import com.example.demo.service.GithubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GithubServiceImpl extends BaseServiceImpl<Github, GitHubRootDTO, Long , GithubRootMapper, GithubRepository>
implements GithubService {

    @Autowired
    public GithubServiceImpl(GithubRepository repository, GithubRootMapper mapper) {
        super(repository, mapper);
    }
}
