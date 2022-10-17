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
        ID extends Serializable,
        M extends BaseMapper<D, E, ID>,
        R extends BaseRepository<E, ID>> implements BaseService<D, ID> {
    protected final R repository;
    protected final M mapper;

    @Override
    public D save(D d) {
        E e = mapper.convertDToE(d);
        e = repository.save(e);
        return mapper.convertEToD(e);
    }

    @Override
    public D update(D d) {
        E e = mapper.convertDToE(d);
        e = repository.save(e);
        return mapper.convertEToD(e);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public List<D> findAll() {
        List<E> eList = repository.findAll();
        return eList.stream().map(mapper::convertEToD).collect(Collectors.toList());
    }

    @Override
    public Optional<D> findById(ID id) {
        return repository.findById(id).map(mapper::convertEToD);

    }

    @Override
    public Page<D> findAll(Pageable pageable) {
        Page<E> all = repository.findAll(pageable);
        List<D> collect = all.stream().map(mapper::convertEToD).collect(Collectors.toList());
        return (Page<D>) collect;
    }

    @Override
    public boolean existById(ID id) {
        return id != null;
    }
}
