package com.example.demo.dto.phonebookdto;

import com.example.demo.base.BaseDTO;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PhoneBookRequestDTO extends BaseDTO<Long> {
    private String name;
    private Long userId;
}
