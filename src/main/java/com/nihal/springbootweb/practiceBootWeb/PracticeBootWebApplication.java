package com.nihal.springbootweb.practiceBootWeb;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Configurable
public class PracticeBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeBootWebApplication.class, args);
	}
}
