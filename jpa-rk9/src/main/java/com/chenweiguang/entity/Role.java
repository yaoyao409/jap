package com.chenweiguang.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "cwg_role")
public class Role {
    @Id
    @Column(name = "id")
    private Integer id;
    private String rname;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name = "base_role_menu",
            joinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id",referencedColumnName = "id")
    )
    private List<Menu> menuList;

}
