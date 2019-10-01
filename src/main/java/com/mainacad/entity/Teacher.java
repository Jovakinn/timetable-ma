package com.mainacad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "teachers")
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends User {

    @Column(name = "user_role")
    private UserRole userRole = UserRole.TEACHER;

    @Column(name = "subject")
    private Subject subject;

}
