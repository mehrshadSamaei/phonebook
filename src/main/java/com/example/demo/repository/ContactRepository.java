package com.example.demo.repository;

import com.example.demo.base.BaseRepository;
import com.example.demo.entity.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends BaseRepository<Contact , Long> {
    @Override
    Page<Contact> findAll(Specification<Contact> spec, Pageable pageable);
}
