package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.webService.entity.Student;
import com.example.demo.webService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Spring 前端控制
 * <p>
 * 通过这个返回正确，作对比
 */
@Controller
public class SpringController {

    @Autowired
    private StudentService studentRestfulService;

    @ResponseBody
    @Produces({MediaType.APPLICATION_JSON + "charset='utf-8'"})
    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public String getStudent(@PathVariable("id") Integer id) {
        Student student = studentRestfulService.getStudent(id);
        Object json = JSONObject.toJSON(student);
        return json.toString();
    }
}
