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
public class Contact extends BaseEntity<Long> {
    @Basic
    @Column(name = "page_num")
    private Integer pageNum;
    @ElementCollection
    @CollectionTable(name = "contact_mobile_num",
            joinColumns = @JoinColumn(name = "contact_id"))
    @Column(name = "mobile_num")
    private Set<String> mobileNum;
    @ElementCollection
    @CollectionTable(name = "contact_phone_num"
            , joinColumns = @JoinColumn(name = "contact_id"))
    @Column(name = "phone_num")
    private Set<String> phoneNum;
    @ElementCollection
    @CollectionTable(name = "contact_organize_num",
            joinColumns = @JoinColumn(name = "contact_id"))
    @Column(name = "organize_num")
    private Set<String> organizeNum;
    @ElementCollection
    @CollectionTable(name = "contact_fax_num",
            joinColumns = @JoinColumn(name = "contact_id"))
    @Column(name = "fax_num")
    private Set<String> faxNum;
    @Basic
    @Column(name = "emil")
    private String emil;
    @ManyToOne
    @JoinColumn(name = "github_id",
            referencedColumnName = "id", insertable = false,
            updatable = false)
    private Github github;
    @ManyToOne
    @JoinColumn(name = "phonebook_id",
            referencedColumnName = "id", insertable = false,
            updatable = false)
    private PhoneBook phoneBook;
}
