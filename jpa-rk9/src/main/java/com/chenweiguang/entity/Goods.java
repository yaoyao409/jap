package com.chenweiguang.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "cwg_goods")
//多对一
public class Goods {
    @Id
    @Column(name = "id")
    private Integer id;
    private String goodsname;
    private String price;
    private Integer num;
    private Date startTime;
    private Date endTime;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(
            name = "brand_id",
            referencedColumnName = "id",insertable = false,updatable = false
    )
    private Brand brand;

}
