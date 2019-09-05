package com.example.demo;

import com.example.demo.webService.entity.Student;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Client {
    public static void main(String[] args) {
        String baseAddress = "http://localhost:8080/cxf/students";
        WebClient webClient = WebClient.create(baseAddress)
                .path("/getjson").path("/2");
        Response resp = webClient.accept(MediaType.APPLICATION_XML).type(MediaType.APPLICATION_XML).get();
        System.out.println(resp.getMetadata());
        System.out.println(resp.readEntity(Student.class));

    }
}
