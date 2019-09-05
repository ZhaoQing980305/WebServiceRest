package com.example.demo.webService.dao;

import com.example.demo.webService.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {

    Student getStudentById(@Param("id") Integer id);
}
