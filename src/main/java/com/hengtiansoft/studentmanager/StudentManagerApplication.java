package com.hengtiansoft.studentmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hengtiansoft.studentmanager.mapper")
public class StudentManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentManagerApplication.class, args);
    }
}
