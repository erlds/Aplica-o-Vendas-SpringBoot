package io.github.erlds;


import io.github.erlds.domain.entity.Cliente;
import io.github.erlds.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VendasApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);
    }
}
