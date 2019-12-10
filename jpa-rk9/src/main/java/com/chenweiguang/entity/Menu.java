package com.chenweiguang.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cwg_menu")
@Data
public class Menu {
    @Id
    @Column(name = "id")
    private Integer id;
    private String mname;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name = "base_role_menu",
            joinColumns = @JoinColumn(name = "menu_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id")
    )
    private List<Role> roleList;

}
