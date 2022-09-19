package org.movescan.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableOpenApi
@EnableWebMvc
@SpringBootApplication(scanBasePackages = "org.movescan")
public class ScanAPIApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScanAPIApplication.class, args);
    }
}