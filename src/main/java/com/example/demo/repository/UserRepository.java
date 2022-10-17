package com.example.demo.repository;

import com.example.demo.base.BaseRepository;
import com.example.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {
    @Override
    Page<User> findAll(Specification<User> spec, Pageable pageable);
}
