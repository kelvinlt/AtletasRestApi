package com.kelvin.atlteasrestapi;

import com.kelvin.atlteasrestapi.service.AtletaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AtlteasrestapiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AtlteasrestapiApplication.class, args);
		context.getBean(AtletaService.class).testAtletas();
	}
}
