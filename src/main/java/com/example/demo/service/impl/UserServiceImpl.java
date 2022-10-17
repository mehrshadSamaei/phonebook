package com.example.demo.service.impl;

import com.example.demo.base.BaseServiceImpl;
import com.example.demo.dto.root.UserRootDTO;
import com.example.demo.dto.search.UserSearch;
import com.example.demo.dto.userdto.UserRequestDTO;
import com.example.demo.dto.userdto.UserResponseDTO;
import com.example.demo.entity.User;
import com.example.demo.mapper.response.UserResponseMapper;
import com.example.demo.mapper.root.UserRootMapper;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
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
public class UserServiceImpl extends BaseServiceImpl
        <User , UserResponseDTO , UserRequestDTO , Long , UserResponseMapper , UserRepository>
        implements UserService {

    public UserServiceImpl(UserRepository repository, UserResponseMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public List<UserRootDTO> findAllByAdvanceSearch(UserSearch userSearch) {
        repository.findAll(
                (root, query, criteriaBuilder) -> {
                    List<Predicate> predicates = new ArrayList<>();
                    setFirstNameInPredicate(root, predicates, criteriaBuilder, userSearch.getFirstName());
                    setLastNameInPredicate(root, predicates, criteriaBuilder, userSearch.getLastName());
                    setUsernameInPredicate(root, predicates, criteriaBuilder, userSearch.getUsername());
                    return criteriaBuilder.and(
                            predicates.toArray(predicates.toArray(new Predicate[0]))
                    );
                }
        );
        return null;
    }

    private void setUsernameInPredicate(Root<User> root, List<Predicate> predicates, CriteriaBuilder criteriaBuilder, String username) {
        if (username != null && username.isEmpty()) {
            predicates.add(
                    criteriaBuilder.like(
                            root.get(
                                    "username"
                            ),
                            "%" + username + "%"
                    )
            );
        }
    }

    private void setLastNameInPredicate(Root<User> root, List<Predicate> predicates, CriteriaBuilder criteriaBuilder, String lastName) {
        if (lastName != null && lastName.isEmpty()) {
            predicates.add(
                    criteriaBuilder.like(
                            root.get(
                                    "lastName"
                            ),
                            "%" + lastName + "%"
                    )

            );
        }
    }

    private void setFirstNameInPredicate(Root<User> root, List<Predicate> predicates, CriteriaBuilder criteriaBuilder, String firstName) {
        if (firstName != null && firstName.isEmpty()) {
            predicates.add(
                    criteriaBuilder.like(
                            root.get(
                                    "firstName"

                            ),
                            "%" + firstName + "%"
                    )
            );
        }
    }
}
