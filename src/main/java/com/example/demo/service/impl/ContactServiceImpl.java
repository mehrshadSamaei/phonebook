package com.example.demo.service.impl;

import com.example.demo.base.BaseServiceImpl;
import com.example.demo.dto.contactdto.ContactRequestDTO;
import com.example.demo.dto.contactdto.ContactResponseDTO;
import com.example.demo.dto.search.ContactSearch;
import com.example.demo.entity.Contact;
import com.example.demo.mapper.response.ContactResponseMapper;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class ContactServiceImpl extends BaseServiceImpl<
        Contact , ContactResponseDTO , ContactRequestDTO , Long ,
        ContactResponseMapper, ContactRepository>implements ContactService {


    public ContactServiceImpl(ContactRepository repository, ContactResponseMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public List<ContactResponseDTO> findAllByAdvanceSearch(ContactSearch contactSearch) {
        repository.findAll(
                ((root, query, criteriaBuilder) -> {
                    List<Predicate> predicates = new ArrayList<>();
                    setMobileNumInPredicate(root, criteriaBuilder, predicates, contactSearch.getMobileNum());
                    setPhoneNumInPredicate(root, criteriaBuilder, predicates, contactSearch.getPhoneNum());
                    setOrganizeInPredicate(root, criteriaBuilder, predicates, contactSearch.getOrganizeNum());
                    setFaxNumInPredicate(root, criteriaBuilder, predicates, contactSearch.getFaxNum());
                    setEmailInPredicate(root, criteriaBuilder, predicates, contactSearch.getEmail());
                    return criteriaBuilder.and(
                            predicates.toArray(new Predicate[0])
                    );
                })
        );
        return null;
    }

    private void setEmailInPredicate(Root<Contact> root, CriteriaBuilder criteriaBuilder, List<Predicate> predicates, String email) {
        predicates.add(
          criteriaBuilder.like(
                  root.get("email") , "%" + email + "%"
          )
        );
    }

    private void setFaxNumInPredicate(Root<Contact> root, CriteriaBuilder criteriaBuilder, List<Predicate> predicates, String faxNum) {
            predicates.add(
                    criteriaBuilder.like(
                            root.get("faxNum") , "%" +faxNum+ "%"
                    )
            );
    }

    private void setOrganizeInPredicate(Root<Contact> root, CriteriaBuilder criteriaBuilder, List<Predicate> predicates, String organizeNum) {
            predicates.add(
              criteriaBuilder.like(
                      root.get(
                              "organizeNum"
                      ) , "%"+organizeNum+"%"
              )
            );
    }

    private void setPhoneNumInPredicate(Root<Contact> root, CriteriaBuilder criteriaBuilder, List<Predicate> predicates, String phoneNum) {
        predicates.add(
          criteriaBuilder.like(
                  root.get(
                          "phoneNum"
                  ) , "%" +phoneNum + "%"
          )
        );
    }

    private void setMobileNumInPredicate(Root<Contact> root, CriteriaBuilder criteriaBuilder, List<Predicate> predicates, String mobileNum) {
        predicates.add(
                criteriaBuilder.like(
                        root.get("mobileNum"),
                        "%" + mobileNum +
                                "%"
                )
        );
    }
}
