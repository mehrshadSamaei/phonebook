package com.example.demo.repository;

import com.example.demo.base.BaseRepository;
import com.example.demo.entity.Github;
import com.example.demo.entity.PhoneBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

@Repository
public interface GithubRepository extends BaseRepository<Github, Long> {
    @Override
    Page<Github> findAll(Specification<Github> spec, Pageable pageable);
}
