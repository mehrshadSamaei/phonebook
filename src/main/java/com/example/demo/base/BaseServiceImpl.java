package com.example.demo.base;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BaseServiceImpl<E extends BaseEntity<ID>,
        D extends BaseDTO<ID>,
        T extends BaseDTO<ID>,
        ID extends Serializable,
        M extends BaseMapper<D, E, ID>,
        R extends BaseRepository<E, ID>> implements BaseService<D, T, ID> {
    protected final R repository;
    protected final M mapper;


    @Override
    public void deleteById(Serializable serializable) {

    }

    @Override
    public D save(T t) {
        return null;
    }

    @Override
    public D update(T t) {
        return null;
    }

    @Override
    public List<D> findAll() {
        return null;
    }

    @Override
    public Optional<D> findById(Serializable serializable) {
        return Optional.empty();
    }

    @Override
    public Page<D> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public boolean existById(Serializable serializable) {
        return false;
    }
}
