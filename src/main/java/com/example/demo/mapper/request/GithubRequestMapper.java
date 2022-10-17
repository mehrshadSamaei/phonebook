package com.example.demo.mapper.request;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.githubdto.GithubRequestDTO;
import com.example.demo.dto.root.GitHubRootDTO;
import com.example.demo.entity.Github;
import org.mapstruct.Mapper;

@Mapper
public interface GithubRequestMapper extends BaseMapper<GithubRequestDTO, Github, Long> {
}
