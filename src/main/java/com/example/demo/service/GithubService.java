package com.example.demo.service;

import com.example.demo.base.BaseService;
import com.example.demo.dto.githubdto.GithubRequestDTO;
import com.example.demo.dto.githubdto.GithubResponseDTO;
import com.example.demo.dto.root.GitHubRootDTO;
import com.example.demo.dto.search.GithubSearch;

import java.util.List;

public interface GithubService extends BaseService<GithubResponseDTO , GithubRequestDTO , Long> {
    List<GithubResponseDTO> findAllByAdvanceSearch(GithubSearch githubSearch);
}
