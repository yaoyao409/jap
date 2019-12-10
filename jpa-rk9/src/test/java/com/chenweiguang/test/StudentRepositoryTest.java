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

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void testQuery(){
        Student byname = studentRepository.findByName("我想被风吹");
        System.out.println(byname);
    }
    @Test
    public void testBirthday(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,12,10);
        Date time = calendar.getTime();
        //查询生日
        List<Student> stu = studentRepository.findByBirthdayIsLessThan(time);
        System.out.println(stu);
    }
}
