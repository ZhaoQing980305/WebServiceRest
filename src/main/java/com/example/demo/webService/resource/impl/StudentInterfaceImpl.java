package com.example.demo.webService.resource.impl;

import com.example.demo.webService.entity.Student;
import com.example.demo.webService.resource.StudentInterface;
import com.example.demo.webService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class StudentInterfaceImpl implements StudentInterface {

    @Autowired
    private StudentService studentService;

    // 获取json
    @Override
    @GET
    @Path("/getjson/{id:[0-9]{0,10}}")
    @Produces({MediaType.APPLICATION_JSON})
    public Student getStudent(@PathParam("id") Integer id) {
        return studentService.getStudent(id);
    }

    // 获取xml
    @GET
    @Path("/getxml/{id}")
    @Produces({MediaType.APPLICATION_XML})
    public Student getStudent2(@PathParam("id") Integer id) {
        return studentService.getStudent(id);
    }

}
