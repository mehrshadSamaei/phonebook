package com.example.demo.mapper.response;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.githubdto.GithubRequestDTO;
import com.example.demo.dto.githubdto.GithubResponseDTO;
import com.example.demo.dto.root.GitHubRootDTO;
import com.example.demo.entity.Github;
import org.mapstruct.Mapper;

@Mapper
public interface GithubResponseMapper extends BaseMapper<GithubRequestDTO, GithubResponseDTO, Github, Long> {
}
