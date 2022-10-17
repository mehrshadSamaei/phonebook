package com.example.demo.dto.root;

import com.example.demo.base.BaseDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class PhoneBookRootDTO extends BaseDTO<Long> {
    private String name;
}
