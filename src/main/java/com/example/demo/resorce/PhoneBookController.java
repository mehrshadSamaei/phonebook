package com.example.demo.resorce;

import com.example.demo.dto.phonebookdto.PhoneBookRequestDTO;
import com.example.demo.dto.phonebookdto.PhoneBookResponseDTO;
import com.example.demo.dto.root.PhoneBookRootDTO;
import com.example.demo.dto.search.PhoneBookSearch;
import com.example.demo.service.PhoneBookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/phonebook")
public class PhoneBookController {
    private final PhoneBookService phoneBookService;

    public PhoneBookController(PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
    }

    @GetMapping("/find-phone-book")
    public ResponseEntity<PhoneBookResponseDTO> getByIdPhoneBook(@RequestParam Long id){
        PhoneBookResponseDTO phoneBookResponseDTO = phoneBookService.findById(id);
        return ResponseEntity.ok(
                phoneBookResponseDTO
        );
    }
    @PostMapping
    public ResponseEntity<PhoneBookResponseDTO> savePhoneBook(@RequestBody PhoneBookRequestDTO phoneBookRequestDTO){
        PhoneBookResponseDTO phoneBookResponseDTO = phoneBookService.save(phoneBookRequestDTO);
        return ResponseEntity.ok(
                phoneBookResponseDTO
        );
    }
    @PutMapping
    public ResponseEntity<PhoneBookResponseDTO> update(@RequestBody PhoneBookRequestDTO phoneBookRequestDTO){
        PhoneBookResponseDTO phoneBookResponseDTO = phoneBookService.update(phoneBookRequestDTO);
        return ResponseEntity.ok(
                phoneBookResponseDTO
        );
    }
    @GetMapping("/all-phone-books")
    public ResponseEntity<List<PhoneBookResponseDTO>> findAll(){
        List<PhoneBookResponseDTO> phoneBookResponseDTOS = phoneBookService.findAll();
        return ResponseEntity.ok(
                phoneBookResponseDTOS
        );
    }
    @PostMapping("/search-phone-book")
    public ResponseEntity<List<PhoneBookResponseDTO>> findAllPagination(@RequestBody PhoneBookSearch phoneBookSearch){
        List<PhoneBookResponseDTO> allByAdvanceSearch = phoneBookService.findAllByAdvanceSearch(phoneBookSearch);
        return ResponseEntity.ok(
                allByAdvanceSearch
        );
    }
}
