package com.example.demo.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseEntity <ID extends Serializable> implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;
    @Column(name = "is_active")
    private Boolean isActive;
}
