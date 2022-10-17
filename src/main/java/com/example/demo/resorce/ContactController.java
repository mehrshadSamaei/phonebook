package com.example.demo.resorce;
import com.example.demo.dto.contactdto.ContactRequestDTO;
import com.example.demo.dto.contactdto.ContactResponseDTO;
import com.example.demo.dto.root.ContactRootDTO;
import com.example.demo.dto.search.ContactSearch;
import com.example.demo.service.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @GetMapping("/find-contact-id")
    public ResponseEntity<ContactResponseDTO> getById(@RequestParam Long id){
        ContactResponseDTO contactResponseDTO = contactService.findById(id).get();
        return ResponseEntity.ok(
                contactResponseDTO
        );
    }
    @PostMapping("/save-contact")
    public ResponseEntity<ContactResponseDTO> saveContact(@RequestBody ContactRequestDTO contactRequestDTO){
        ContactResponseDTO contactResponseDTO = contactService.save(contactRequestDTO);
        return ResponseEntity.ok(
                contactResponseDTO
        );
    }
    @PutMapping
    public ResponseEntity<ContactResponseDTO> updateContact(@RequestBody ContactRequestDTO contactRequestDTO){
        ContactResponseDTO contactResponseDTO = contactService.update(contactRequestDTO);
        return ResponseEntity.ok(
                contactResponseDTO
        );
    }
    @GetMapping("/all-contact")
    public  ResponseEntity<List<ContactResponseDTO>> findAllContact(){
        List<ContactResponseDTO> all = contactService.findAll();
        return ResponseEntity.ok(
                all
        );
    }
    @PostMapping("/search-contact")
    public ResponseEntity<List<ContactRootDTO>> findAllSearch(@RequestBody ContactSearch contactSearch){
        List<ContactRootDTO> allByAdvanceSearch = contactService.findAllByAdvanceSearch(contactSearch);
        return ResponseEntity.ok(allByAdvanceSearch);
    }
}
