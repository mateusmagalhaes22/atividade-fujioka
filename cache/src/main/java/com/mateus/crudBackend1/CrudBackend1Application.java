package com.mateus.crudBackend1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CrudBackend1Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudBackend1Application.class, args);
	}

}
