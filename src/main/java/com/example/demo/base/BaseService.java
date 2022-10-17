package com.example.demo.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService<D extends BaseDTO<ID> ,M extends BaseDTO<ID> ,
        ID extends Serializable> {

    D save(M m);

    D update(M m);

    void deleteById(ID id);

    List<D> findAll();

    Optional<D> findById(ID id);

    Page<D> findAll(Pageable pageable);

    boolean existById(ID id);



}
