package com.example.demo.entity;

import com.example.demo.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Github extends BaseEntity<Long> {
    @Basic
    @Column(name = "username")
    private String username;
    @Column(name = "repositories")
    @ElementCollection
    private Set<String> repositories;
}
