package com.example.bds_backend.entity;

import com.example.bds_backend.enums.UserType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String username;

    private String email;

    private String password;

    private String fullname;

    private String phone;

    private Boolean actived;

    private String activation_key;

    private String rememberKey;

    private Date createdDate;

    private String tokenFcm;

    private UserType userType;

    private Double amount;

    @ManyToOne
    @JoinColumn(name = "authority_name")
    private Authority authorities;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId().equals(user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}


