package com.cadastrofornecedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CadastroFornecedorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CadastroFornecedorApplication.class, args);
    }

}
