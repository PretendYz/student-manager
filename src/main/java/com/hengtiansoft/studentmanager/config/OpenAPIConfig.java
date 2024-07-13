package com.hengtiansoft.studentmanager.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/10 23:00
 * @Description:
 */
@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(new Info().title("接口文档标题").description("SpringBoot3 集成 Swagger3接口文档").version("v1")).externalDocs(new ExternalDocumentation().description("项目API文档").url("/"));
    }
}