package com.example.demo.base;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
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
        M extends BaseMapper<T, D, E, ID>,
        R extends BaseRepository<E, ID>> implements BaseService<D, T, ID> {
    protected final R repository;
    protected final M mapper;


    @Override
    public void deleteById(ID id) {
        E e = repository.findById(id).get();
        if (e.getId() != null) {
            Boolean isActive = e.getIsActive();
            isActive = false;
        }

    }

    @Transactional
    @Override
    public D save(T t) {
        E e = mapper.convertTToE(t);
        if (e.getId() == null || !e.getIsActive()) {
            return mapper.convertEToD(e);
        }

        return null;
    }

    @Transactional
    @Override
    public D update(T t) {
        E e = mapper.convertTToE(t);
        if (e.getId() != null || e.getIsActive()) {
            return mapper.convertEToD(e);
        }
        return null;
    }

    @Override
    public List<D> findAll() {
        List<E> eList = repository.findAll();
        return mapper.convertListEToListD(eList);
    }

    @Override
    public D findById(ID id) {
        Optional<E> byId = repository.findById(id);
        return mapper.convertEToD(byId.get());
    }

    @Override
    public Page<D> findAll(Pageable pageable) {
        Page<E> ePage = repository.findAll(pageable);
        return null;
    }

    @Override
    public boolean existById(ID id) {
        if (id != null) {
            return false;
        } else {
            return true;
        }
    }
}
