package io.github.erlds;


import io.github.erlds.domain.entity.Cliente;
import io.github.erlds.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
            System.out.println("Salvando clientes");
            clientes.save(new Cliente("Evaristo"));
            clientes.save(new Cliente("Irenice"));

            boolean existe = clientes.existsByNome("Evaristo");
            System.out.println("Existe um cliente com o nome Evaristo? " + existe);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);
    }
}
