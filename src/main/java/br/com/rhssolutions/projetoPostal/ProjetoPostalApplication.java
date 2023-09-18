package br.com.rhssolutions.projetoPostal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  Projeto Spring Boot gerado via Spring Initializr.
 *
 *  Os seguintes módulos foram selecionados:
 *
 *  - Spring Data JPA
 *  - Spring Web
 *  - H2 Database
 *  - OpenFeign
 *  - Swagger
 *
 *
 * @author RHSsolutions
 */

@EnableFeignClients
@SpringBootApplication
public class ProjetoPostalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPostalApplication.class, args);
	}

}
