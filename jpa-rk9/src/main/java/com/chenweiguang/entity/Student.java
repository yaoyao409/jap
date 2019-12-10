package com.chenweiguang.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "cwg_student") //指定表名
public class Student {
    @GeneratedValue(strategy =  GenerationType.IDENTITY)//主键生成策略,自增
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name") //指定列名
    private String name;
    private Date birthday;
    private String sex;
    private String pic;
    @Column(name = "dep_id")
    private Integer depId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dep_id",referencedColumnName = "id",insertable = false,updatable = false)
    private Dep dep;


}
