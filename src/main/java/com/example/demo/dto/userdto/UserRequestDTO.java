package com.example.demo.dto.userdto;

import com.example.demo.base.BaseDTO;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRequestDTO extends BaseDTO<Long> {
    private String firstName;
    private String lastName;
    private String username;

}
