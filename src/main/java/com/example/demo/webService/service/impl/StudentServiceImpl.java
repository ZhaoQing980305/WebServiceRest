package com.example.demo.webService.service.impl;

import com.example.demo.webService.dao.StudentDao;
import com.example.demo.webService.entity.Student;
import com.example.demo.webService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * 实现webservice接口，对外暴露 soap
 */
@Component//由Spring管理
@WebService(endpointInterface = "com.example.demo.webService.service.StudentService") // webservice接口的全类名
public class StudentServiceImpl implements StudentService {

    /**
     * 注入spring bean
     */
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student getStudent(Integer id) {
        return studentDao.getStudentById(id);
    }

}
