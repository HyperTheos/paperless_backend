package ru.hypertheos.paperless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PaperlessApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaperlessApplication.class, args);
	}

}
