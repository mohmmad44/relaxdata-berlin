package com.relax.data.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= "com.relax.data")
@EnableJpaRepositories(basePackages = "com.relax.data.repository")
@EntityScan(basePackages = "com.relax.data.model")
public class RelaxDataTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelaxDataTaskApplication.class, args);
	}

}
