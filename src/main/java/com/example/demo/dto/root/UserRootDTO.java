package com.example.demo.dto.root;

import com.example.demo.base.BaseDTO;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRootDTO extends BaseDTO<Long> {
    private String firstName;
    private String lastName;
    private String username;
}
