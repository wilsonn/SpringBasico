package com.whnm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.whnm.model.Persona;
import com.whnm.service.IPersonaService;
import com.whnm.service.PersonaServiceImpl;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean(name="personaService")
	public IPersonaService personaService() {
		return new PersonaServiceImpl();
	}
	
	@Bean(name="persona")
	public Persona persona() {
		return new Persona(1,"Wilson", "Neira");
	}
}
