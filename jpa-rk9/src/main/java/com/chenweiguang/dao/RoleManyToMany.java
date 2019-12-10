package com.chenweiguang.dao;

import com.chenweiguang.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleManyToMany extends JpaRepository<Role,Integer> {
}
