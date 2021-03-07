package io.leo.maker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MakerApplication {


	public static void main(String[] args) {
		SpringApplication.run(MakerApplication.class, args);
	}

}
