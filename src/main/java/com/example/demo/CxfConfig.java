package com.example.demo;

import com.example.demo.webService.service.impl.StudentServiceImpl;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Bean
    public ServletRegistrationBean newServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/cxf/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    /**
     * @return
     */
    @Bean
    @Qualifier("studentServiceImpl") // 注入webService
    public Endpoint endpoint(StudentServiceImpl studentServiceImpl) {
        EndpointImpl endpoint = new EndpointImpl(springBus(), studentServiceImpl);
        endpoint.publish("/webService");// 暴露webService api
        return endpoint;
    }

    @Bean("jsonProvider") // 构造一个json转化bean，用于将student转化为json
    public JacksonJsonProvider getJacksonJsonProvider() {
        return new JacksonJsonProvider();

    }
}