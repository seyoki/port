package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing //jpa사용 하기위함
@SpringBootApplication
public class PortfoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfoleApplication.class, args);
	}

}
