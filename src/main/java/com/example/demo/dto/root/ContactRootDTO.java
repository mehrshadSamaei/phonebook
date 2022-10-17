package com.example.demo.dto.root;

import com.example.demo.base.BaseDTO;
import com.example.demo.dto.githubdto.GithubRequestDTO;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactRootDTO extends BaseDTO<Long> {
    private Integer pageNum;
    private String mobileNum;
    private String phoneNum;
    private String organizeNum;
    private String faxNum;
    private String emil;
}
