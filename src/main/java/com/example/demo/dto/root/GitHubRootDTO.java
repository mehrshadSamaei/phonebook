package com.example.demo.dto.root;

import com.example.demo.base.BaseDTO;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GitHubRootDTO extends BaseDTO<Long> {
    private String username;
    private Set<String> repositoriesName;
}
