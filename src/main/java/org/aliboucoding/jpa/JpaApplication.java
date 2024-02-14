package org.aliboucoding.jpa;

import org.aliboucoding.jpa.models.Author;
import org.aliboucoding.jpa.repository.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository authorRepository
	){
		return args -> {
			var author = Author.builder()
					.firstName("Jason")
					.lastName("Lee")
					.age(34)
					.email("edslclee@gmail.com")
//					.createdAt(LocalDateTime.now())
					.build();
			authorRepository.save(author);
		};

	}
}
