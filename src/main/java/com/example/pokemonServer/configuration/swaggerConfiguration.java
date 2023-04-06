package com.example.pokemonServer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import java.util.Collections;


@Configuration
@EnableSwagger2
public class swaggerConfiguration {
    //Failed to start bean 'documentationPluginsBootstrapper'; nested exception is java.lang.NullPointerException
    //https://stackoverflow.com/questions/40241843/failed-to-start-bean-documentationpluginsbootstrapper-in-spring-data-rest
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "SpringBoot ice break",
                "This is SpringBoot practice for ice break",
                "VERSION 1.0",
                "http://localhost:8080/davin-swagger.html#/",
                null,
                "",
                "",
                Collections.emptyList()
        );
    }

}
