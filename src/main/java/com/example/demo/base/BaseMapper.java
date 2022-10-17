package com.example.demo.base;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<D extends BaseDTO<ID>,
        E extends BaseEntity<ID>,
        ID extends Serializable> {

    E convertDToE(D d);

    D convertEToD(E e);

    List<E> convertListDToListE(List<D> dList);

    List<D> convertListEToListD(List<E> eList);
}
