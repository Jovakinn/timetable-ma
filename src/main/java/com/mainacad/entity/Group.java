package com.mainacad.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne(targetEntity = Specialization.class)
    private Specialization specialization;

}
