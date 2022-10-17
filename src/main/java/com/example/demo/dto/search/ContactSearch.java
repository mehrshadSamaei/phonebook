package com.example.demo.dto.search;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ContactSearch {
    private Integer pageNum;
    private String mobileNum;
    private String phoneNum;
    private String organizeNum;
    private String faxNum;
    private String email;
}
