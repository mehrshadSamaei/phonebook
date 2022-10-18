package com.example.demo.service.impl;

import com.example.demo.base.BaseServiceImpl;
import com.example.demo.dto.githubdto.GithubRequestDTO;
import com.example.demo.dto.githubdto.GithubResponseDTO;
import com.example.demo.dto.search.GithubSearch;
import com.example.demo.entity.Github;
import com.example.demo.mapper.response.GithubResponseMapper;
import com.example.demo.repository.GithubRepository;
import com.example.demo.service.GithubService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class GithubServiceImpl extends BaseServiceImpl<Github, GithubResponseDTO , GithubRequestDTO ,Long ,
        GithubResponseMapper , GithubRepository>
implements GithubService {
    public GithubServiceImpl(GithubRepository repository, GithubResponseMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public List<GithubResponseDTO> findAllByAdvanceSearch(GithubSearch githubSearch) {
        repository.findAll(
                (root, query, criteriaBuilder) -> {
                    List<Predicate> predicates = new ArrayList<>();
                    setUsernameInPredicate(root , criteriaBuilder , predicates , githubSearch.getUsername());
                    return criteriaBuilder.and(
                            predicates.toArray(new Predicate[0])
                    );
                }
        );
        return null;
    }

    private void setUsernameInPredicate(Root<Github> root, CriteriaBuilder criteriaBuilder, List<Predicate> predicates, String username) {
        predicates.add(
          criteriaBuilder.like(
                  root.get("username") , "%"+ username +"%"
          )
        );

    }
}
