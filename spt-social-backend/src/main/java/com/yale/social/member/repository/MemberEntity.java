package com.yale.social.member.repository;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;


@Data
@Entity
@Setter
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pk;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="enable", nullable = false)
    private Boolean enable;
}
