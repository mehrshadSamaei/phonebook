package com.example.demo.entity;

import com.example.demo.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PhoneBook extends BaseEntity<Long> {
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "user_id")
    private Long userId;
    @ManyToOne
    @JoinColumn(name = "user_id" , referencedColumnName = "id" , insertable = false , updatable = false)
    private User user;
}
