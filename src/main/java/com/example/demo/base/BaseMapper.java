package com.example.demo.base;

import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T extends BaseDTO<ID>, D extends BaseDTO<ID>,
        E extends BaseEntity<ID>,
        ID extends Serializable> {

    E convertTToE(T t);

    E convertDToE(D d);

    D convertEToD(E e);

    T convertEToT(E e);

    List<E> convertListTToListE(List<T> tList);

    List<E> convertListDToListE(List<D> tList);

    List<D> convertListEToListD(List<E> eList);

    List<T> convertListEToListT(List<E> eList);

//    Page<E> convertPageDToE(Page<D> dPage);
//
//    Page<D> convertPageEToD(Page<E> dPage);
}
