package com.example.demo.resorce;
import com.example.demo.dto.search.UserSearch;
import com.example.demo.dto.userdto.UserRequestDTO;
import com.example.demo.dto.userdto.UserResponseDTO;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {
    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

   @GetMapping
    public ResponseEntity<UserResponseDTO> getById(@RequestParam Long id){
       UserResponseDTO userResponseDTO = userService.findById(id);
       return ResponseEntity.ok(
               userResponseDTO
       );
   }
   @PostMapping
    public ResponseEntity<UserResponseDTO> saveUser(@RequestBody UserRequestDTO userRequestDTO){
       UserResponseDTO userResponseDTO = userService.save(userRequestDTO);
       return ResponseEntity.ok(
               userResponseDTO
       );
   }
   @PutMapping
    public ResponseEntity<UserResponseDTO> updateUserInfo(@RequestBody UserRequestDTO userRequestDTO){
       UserResponseDTO userResponseDTO = userService.update(userRequestDTO);
       return ResponseEntity.ok(
               userResponseDTO
       );
   }
   @GetMapping("/all-users")
    public ResponseEntity<List<UserResponseDTO>> findAllUsers(){
       List<UserResponseDTO> userResponseDTOS = userService.findAll();
       return ResponseEntity.ok(
               userResponseDTOS
       );
   }
   @GetMapping("/page-users")
    public ResponseEntity<List<UserResponseDTO>> findAllUsersPagination(){
       List<UserResponseDTO> userResponseDTOS = userService.findAll();
       return ResponseEntity.ok(
               userResponseDTOS
       );
   }
   @PostMapping("/search")
    public ResponseEntity<List<UserResponseDTO>> findAllAdvanceSearch(@RequestBody UserSearch userSearch){
       List<UserResponseDTO> allByAdvanceSearch = userService.findAllByAdvanceSearch(userSearch);
       return ResponseEntity.ok(
               allByAdvanceSearch
       );
   }
}
