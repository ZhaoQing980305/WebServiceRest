package com.example.demo.webService.resource;


import com.example.demo.webService.entity.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public interface StudentInterface {

    /**
     * @param id
     * @return
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/getone/{id:[0-9]{0,10}}")
    // 限制id只能是0~9的数组 不超过10位
    Student getStudent(@PathParam("id") Integer id);
}
