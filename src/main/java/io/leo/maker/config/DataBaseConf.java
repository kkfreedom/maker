package io.leo.maker.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "database")
public class DataBaseConf {
    private String url;

    private String port;

    private String user;

    private String password;
}
