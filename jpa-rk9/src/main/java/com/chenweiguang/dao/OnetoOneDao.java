package com.chenweiguang.dao;

import com.chenweiguang.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OnetoOneDao extends JpaRepository<Student,Integer> {
}
