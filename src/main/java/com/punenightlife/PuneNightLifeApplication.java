package com.punenightlife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan("com.punenightlife")

public class PuneNightLifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuneNightLifeApplication.class, args);
	}

}
