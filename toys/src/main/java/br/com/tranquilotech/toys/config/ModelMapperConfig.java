package br.com.tranquilotech.toys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapperConfig modelMapper() {
        return new ModelMapperConfig();
    }
}
