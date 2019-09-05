package com.example.demo.webService.resource.impl;

import com.example.demo.DemoApplication;
import com.example.demo.webService.entity.Student;
import com.example.demo.webService.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
public class StudentInterfaceImplTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void getStudent() {
        Student student = studentService.getStudent(1);
        System.out.println("测试StudentInterfaceImpl的getjson方法:\n" + student.toString() + "\n");
    }

    @Test
    public void getStudent2() {
        Student student = studentService.getStudent(2);
        System.out.println("测试StudentInterfaceImpl的getxml方法:\n" + student.toString() + "\n");
    }
}