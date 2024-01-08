package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // CORS: 같은 도메인이 아니면 접근 불허
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // 모든 출발지 허용 (특정 URL에 대해서만 허용해주는 기능)
                .allowedMethods("*"); // 모든 메서드 허용 (GET, POST, PATCH 등)
    }
}
