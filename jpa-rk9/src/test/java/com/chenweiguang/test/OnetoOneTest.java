package com.chenweiguang.test;

import com.alibaba.fastjson.JSON;
import com.chenweiguang.dao.BrandOnetoMany;
import com.chenweiguang.dao.OnetoOneDao;
import com.chenweiguang.dao.RoleManyToMany;
import com.chenweiguang.dao.StudentRepository;
import com.chenweiguang.entity.Brand;
import com.chenweiguang.entity.Role;
import com.chenweiguang.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OnetoOneTest {
    @Autowired
    private OnetoOneDao onetoOneDao;
    //一对一
    @Test
    public void testOne(){
        Student student = onetoOneDao.findById(1).get();
        Student student1 = student.getDep().getStudent();
        System.out.println(JSON.toJSONString(student1));

    }
    @Autowired
    private BrandOnetoMany brandOnetoMany;
    //一对多
    @Test
    public void TestOneToMany(){
        Optional<Brand> byId = brandOnetoMany.findById(1);
        System.out.println(JSON.toJSONString(byId.get().getList().get(0).getBrand()));
    }
    @Autowired
    private RoleManyToMany roleManyToMany;
    @Test //多对多
    public void TestManyToMany(){
        Optional<Role> byId = roleManyToMany.findById(1);
        System.out.println(JSON.toJSONString(byId.get()));
    }


}
