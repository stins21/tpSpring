package com.testopa.testopa;

import com.testopa.testopa.services.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestopaApplication {

	@Autowired
	private DataLoader dataLoader;

	public static void main(String[] args) {
		SpringApplication.run(TestopaApplication.class, args);
	}
}
