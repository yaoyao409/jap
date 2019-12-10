package com.chenweiguang.dao;


import com.chenweiguang.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    //查询接口的命名规范
    Student findByName(String name);
    //查询2019-12-10的生日
    List<Student> findByBirthdayIsLessThan(Date date);

}
