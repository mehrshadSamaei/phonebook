package com.example.demo.mapper.root;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.root.GitHubRootDTO;
import com.example.demo.dto.root.UserRootDTO;
import com.example.demo.entity.Github;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface GithubRootMapper extends BaseMapper<GitHubRootDTO, Github, Long> {
}
