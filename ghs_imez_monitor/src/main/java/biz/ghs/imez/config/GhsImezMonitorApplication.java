package biz.ghs.imez.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "biz.ghs.imez")
public class GhsImezMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhsImezMonitorApplication.class, args);
	}

}

