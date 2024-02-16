package com.mqnic.testmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TestModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestModuleApplication.class, args);
    }

}
