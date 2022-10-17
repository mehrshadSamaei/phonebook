package com.example.demo.dto.userdto;

import com.example.demo.base.BaseDTO;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO extends BaseDTO<Long> {
    private String firstName;
    private String lastName;
    private String username;
}
