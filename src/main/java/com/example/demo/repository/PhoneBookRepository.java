package com.example.demo.repository;

import com.example.demo.base.BaseRepository;
import com.example.demo.entity.PhoneBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneBookRepository extends BaseRepository<PhoneBook , Long> {
    @Override
    Page<PhoneBook> findAll(Specification<PhoneBook> spec, Pageable pageable);
}
