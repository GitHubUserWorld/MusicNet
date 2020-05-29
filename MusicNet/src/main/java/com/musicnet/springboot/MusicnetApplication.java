package com.musicnet.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.musicnet.springboot.service.StorageProperties;
import com.musicnet.springboot.service.StorageService;



@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
@EnableJpaAuditing
public class MusicnetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicnetApplication.class, args);		
	}
	
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}
	


}
