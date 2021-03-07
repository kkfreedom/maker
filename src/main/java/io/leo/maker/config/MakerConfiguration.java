package io.leo.maker.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MakerConfiguration {
    @Bean
    public DataBaseConf dataBaseConf() {
        return new DataBaseConf();
    }

}
