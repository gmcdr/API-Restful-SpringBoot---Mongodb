package com.gabriel.project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.gabriel.project.domain.User;
import com.gabriel.project.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		repository.save(maria);
		repository.save(alex);
		repository.save(bob);
	}
}
