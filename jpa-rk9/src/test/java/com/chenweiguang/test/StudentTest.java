package com.chenweiguang.test;

import com.chenweiguang.dao.StudentRepository;
import com.chenweiguang.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {
    @Autowired
    private StudentRepository studentRepository;
    //添加
    @Test
    public void saveadd(){
        Student student = new Student();
        student.setName("我想被风吹");
        student.setBirthday(new Date());
        student.setSex("男");
        studentRepository.save(student);
        List<Student> all = studentRepository.findAll();
        System.out.println(all);
    }

    //查询所有
    @Test
    public void chaxun(){
        List<Student> cha = studentRepository.findAll();
        System.out.println(cha);
    }
    //修改
    @Test
    public void update(){
        Optional<Student> student = studentRepository.findById(1);
        System.out.println(student.isPresent());//判断是否存在
        System.out.println(student.isPresent()?student.get():"不存在");
        if(student.isPresent()){
            Student stu = student.get();
            stu.setName("嘿嘿");
            studentRepository.save(stu);
        }
    }
    //删除
    @Test
    public void del(){
        List<Student> delById = studentRepository.findAll();
        studentRepository.deleteById(4);
    }
}
