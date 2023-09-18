package br.com.rhssolutions.projetoPostal.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DocConfig {

    private Contact contato = new Contact()
            .name("RHSsolutions")
            .email("rhssolutions@gmail.com")
            .url("https://rhssolutions.com.br");

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Projeto Postal")
                        .version("1.0.0")
                        .description("API para postagem de Clientes")
                        .termsOfService("https://rhssolutions.com.br")
                        .contact(contato)
                );
    }


}
