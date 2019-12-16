package com.zero.system.config;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zero.system.Filter.XssFilter;
 

@Configuration
public class XSSFilterConfig {
    @Bean
    public FilterRegistrationBean<Filter> filterRegistrationBean() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<Filter>();
        registration.setFilter(xssFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("xssFilter");
        return registration;
    }
 
    /**
     * 创建一个bean
     * @return
     */
    @Bean(name = "xssFilter")
    public Filter xssFilter() {
        return new XssFilter();
    }
}
