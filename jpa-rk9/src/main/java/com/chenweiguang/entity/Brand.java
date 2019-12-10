package com.chenweiguang.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table(name = "cwg_brand")
@Entity
@Data
public class Brand {
    @Id
    @Column(name = "id")
    private Integer id;
    private String bname;
    //一对多
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "brand",fetch = FetchType.EAGER)
    private List<Goods> list ;

}
