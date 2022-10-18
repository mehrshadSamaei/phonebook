package com.example.demo.service;

import com.example.demo.base.BaseService;
import com.example.demo.dto.phonebookdto.PhoneBookRequestDTO;
import com.example.demo.dto.phonebookdto.PhoneBookResponseDTO;
import com.example.demo.dto.search.PhoneBookSearch;

import java.util.List;

public interface PhoneBookService extends BaseService<PhoneBookResponseDTO , PhoneBookRequestDTO, Long> {
    List<PhoneBookResponseDTO> findAllByAdvanceSearch(PhoneBookSearch phoneBookSearch);
}
