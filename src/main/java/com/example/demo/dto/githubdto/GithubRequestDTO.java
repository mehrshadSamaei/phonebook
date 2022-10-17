package com.example.demo.dto.githubdto;

import com.example.demo.base.BaseDTO;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GithubRequestDTO extends BaseDTO<Long> {
    private String username;
    private Set<String> repositoriesName;
}
