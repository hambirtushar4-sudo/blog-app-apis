package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI blogAppOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Blog App REST APIs")
                        .description("Swagger documentation for Blog Application - created by Tushar Hambir 😎")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Tushar Hambir")
                                .email("tushar@example.com")
                                .url("https://github.com/tusharhambir"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://springdoc.org")));
    }
}
