package com.portfolio.EliasUpstein;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
               .allowedOrigins("https://frontend-ap-eliasupstein.web.app/", "https://frontend-ap-eliasupstein.web.app", "http://localhost:4200");
                //.allowedMethods("GET", "PUT", "DELETE", "POST");
    }
}
