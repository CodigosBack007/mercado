package br.com.senai.backend.sistema_mercado.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Mercadinho Puppy",
        version = "1.0",
        description = "Desenvolvido por Joao Gabriel"
    )
)
public class Swagger {

}