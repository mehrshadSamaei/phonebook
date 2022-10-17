package com.example.demo.dto.contactdto;

import com.example.demo.base.BaseDTO;
import com.example.demo.dto.githubdto.GithubResponseDTO;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class ContactResponseDTO extends BaseDTO<Long> {
    private Integer pageNum;
    private Set<String> mobileNum;
    private Set<String> phoneNum;
    private Set<String> organizeNum;
    private Set<String> faxNum;
    private String emil;
    private GithubResponseDTO github;
}
