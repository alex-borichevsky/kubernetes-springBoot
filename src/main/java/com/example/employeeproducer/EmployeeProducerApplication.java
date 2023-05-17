package com.example.employeeproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class EmployeeProducerApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(EmployeeProducerApplication.class);

        Environment env = app.run(args).getEnvironment();
        String port = env.getProperty("PORT");
        if (port == null) {
            port = "8080"; // Порт по умолчанию, если переменная окружения $PORT не установлена
        }
        System.setProperty("server.port", port);

    }

}
