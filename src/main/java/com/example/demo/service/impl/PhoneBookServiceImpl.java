package com.example.demo.service.impl;

import com.example.demo.base.BaseServiceImpl;
import com.example.demo.dto.phonebookdto.PhoneBookRequestDTO;
import com.example.demo.dto.phonebookdto.PhoneBookResponseDTO;
import com.example.demo.dto.root.PhoneBookRootDTO;
import com.example.demo.dto.search.PhoneBookSearch;
import com.example.demo.entity.PhoneBook;
import com.example.demo.mapper.response.PhoneBookResponseMapper;
import com.example.demo.mapper.root.PhoneBookRootMapper;
import com.example.demo.repository.PhoneBookRepository;
import com.example.demo.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class PhoneBookServiceImpl extends
        BaseServiceImpl<PhoneBook , PhoneBookResponseDTO , PhoneBookRequestDTO ,
                Long , PhoneBookResponseMapper , PhoneBookRepository>
        implements PhoneBookService {


    public PhoneBookServiceImpl(PhoneBookRepository repository, PhoneBookResponseMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public List<PhoneBookRootDTO> findAllByAdvanceSearch(PhoneBookSearch phoneBookSearch) {
        repository.findAll(
                (root, query, criteriaBuilder) -> {
                    List<Predicate> predicates = new ArrayList<>();
                    setNameInPredicate(root, criteriaBuilder, predicates, phoneBookSearch.getName());
                    return criteriaBuilder.and(
                            predicates.toArray(new Predicate[0])
                    );
                }

        );
        return null;
    }

    private void setNameInPredicate(Root<PhoneBook> root, CriteriaBuilder criteriaBuilder, List<Predicate> predicates, String name) {
        predicates.add(
                criteriaBuilder.like(
                        root.get(
                                "name"
                        ), "%" + name + "%"
                )
        );
    }
}
