package com.sachin.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Sachin on 05-04-2020.
 */

@SpringBootApplication
@EnableSwagger2
public class CourseApiApp {

    public static void main(String[] args) {

        SpringApplication.run(CourseApiApp.class, args);
    }
}
