package com.example.demo.entity;

import com.example.demo.base.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends BaseEntity<Long> {
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "username" , unique = true)
    private String username;
    @Basic
    @Column(name = "password")
    private String password;

}
