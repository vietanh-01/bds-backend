package com.example.bds_backend.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authority")
@Getter
@Setter
@ToString
public class Authority {

    @Id
    private String name;

}
