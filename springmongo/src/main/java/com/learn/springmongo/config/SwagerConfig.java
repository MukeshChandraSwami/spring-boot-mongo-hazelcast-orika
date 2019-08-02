package com.learn.springmongo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwagerConfig {

    @Bean
    public Docket api(){
        return  new Docket(DocumentationType.SWAGGER_2).apiInfo(new ApiInfo("Book Store","All books info","1.0","urn:tos",
                new Contact("Mukesh Swami","www.learnspringboot.com.","mukesh@gmail.com"),"Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList()));
    }
}

