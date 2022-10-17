package com.example.demo.service;

import com.example.demo.base.BaseService;
import com.example.demo.dto.contactdto.ContactRequestDTO;
import com.example.demo.dto.contactdto.ContactResponseDTO;
import com.example.demo.dto.root.ContactRootDTO;
import com.example.demo.dto.search.ContactSearch;

import java.util.List;

public interface ContactService extends BaseService<ContactResponseDTO , ContactRequestDTO , Long> {
    List<ContactRootDTO> findAllByAdvanceSearch(ContactSearch contactSearch);
}
