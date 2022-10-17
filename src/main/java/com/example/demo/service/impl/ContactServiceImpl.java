package com.example.demo.service.impl;

import com.example.demo.base.BaseServiceImpl;
import com.example.demo.dto.root.ContactRootDTO;
import com.example.demo.dto.root.UserRootDTO;
import com.example.demo.entity.Contact;
import com.example.demo.entity.User;
import com.example.demo.mapper.root.ContactRootMapper;
import com.example.demo.mapper.root.UserRootMapper;
import com.example.demo.repository.ContactRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.ContactService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ContactServiceImpl extends BaseServiceImpl<Contact, ContactRootDTO, Long , ContactRootMapper, ContactRepository>
implements ContactService {

    public ContactServiceImpl(ContactRepository repository, ContactRootMapper mapper) {
        super(repository, mapper);
    }
}
