package com.example.demo.webService.service;

import com.example.demo.webService.entity.Student;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @description WebService接口定义 soap
 */
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) // 返回类型
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) // 请求类型
@WebService
public interface StudentService {

    /**
     * 查找一个学生
     *
     * @param id
     * @return
     */
    @WebMethod
    Student getStudent(@WebParam(name = "id") Integer id);

}
