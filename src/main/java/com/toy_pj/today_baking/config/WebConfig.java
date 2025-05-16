package com.toy_pj.today_baking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // 모든 경로 허용
                        .allowedOrigins("http://localhost:3000")  // 프론트 주소
                        .allowedMethods("*");  // GET, POST, PUT 등 전부 허용
            }
        };
    }

}
