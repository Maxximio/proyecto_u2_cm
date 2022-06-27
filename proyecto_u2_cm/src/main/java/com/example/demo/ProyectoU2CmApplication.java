package com.example.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoU2CmApplication implements CommandLineRunner{

	private static final Logger log=LogManager.getLogger(ProyectoU2CmApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Hola Mundo");
		log.info("Hola Mundo");
	}

}
