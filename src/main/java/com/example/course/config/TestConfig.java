package com.example.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

// Uma classe de configuração: é muito utilizado em projetos
// Popular nosso banco de dados com objetos: "database seeding"
// Precisa acessar o banco de dados, usando o UserRepository
// injeção de dependência: há manuais e automáticos
// manuais: construtor, fábrica, outros
// automáticos: frameworks -> o que vamos usar na classe TestConfig
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired // somente com esta annotation autowired
	private UserRepository userRepository;

	// Precisa iniciar a aplicação. No caso, usamos a interface
	// commandLineRuuner e instanciamos objeto
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
	
}
