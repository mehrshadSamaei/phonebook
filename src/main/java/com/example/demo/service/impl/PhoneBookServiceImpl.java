package com.example.demo.service.impl;

import com.example.demo.base.BaseServiceImpl;
import com.example.demo.dto.root.ContactRootDTO;
import com.example.demo.dto.root.PhoneBookRootDTO;
import com.example.demo.entity.Contact;
import com.example.demo.entity.PhoneBook;
import com.example.demo.mapper.root.ContactRootMapper;
import com.example.demo.mapper.root.PhoneBookRootMapper;
import com.example.demo.repository.ContactRepository;
import com.example.demo.repository.PhoneBookRepository;
import com.example.demo.service.ContactService;
import com.example.demo.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PhoneBookServiceImpl extends BaseServiceImpl<PhoneBook, PhoneBookRootDTO, Long, PhoneBookRootMapper, PhoneBookRepository>
        implements PhoneBookService {

    @Autowired
    public PhoneBookServiceImpl(PhoneBookRepository repository, PhoneBookRootMapper mapper) {
        super(repository, mapper);
    }
}
