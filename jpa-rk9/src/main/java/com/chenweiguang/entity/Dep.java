package com.chenweiguang.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cwg_dep")
public class Dep {
    @Id
    @Column(name = "id")
    private Integer id;
    private String dname;
    @Column(name = "student_id")
    private Integer studentId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "student_id",
            referencedColumnName = "id",
            insertable = false,updatable = false
    )
    private Student student;

}
