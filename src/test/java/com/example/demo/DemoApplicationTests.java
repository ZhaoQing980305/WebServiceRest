package com.example.demo;

import com.example.demo.webService.entity.Student;
import com.example.demo.webService.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
public class DemoApplicationTests {

    @Autowired
    private StudentService studentService;
    @Resource
    private SpringController springController;

    @Test
    public void contextLoads() {
        //测试StudentService方法
        Student student = studentService.getStudent(2);
        System.out.println("测试StudentService方法:\n" + student.toString() + "\n");

        //测试SpringController方法
        System.out.println("测试SpringController方法:\n" + springController.getStudent(1));
    }

}
