package edu.galaxy.tanaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("edu.galaxy.tanaka.repositories")
public class TanakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TanakaApplication.class, args);
	}

}
