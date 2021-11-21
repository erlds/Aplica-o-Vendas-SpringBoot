package io.github.erlds.rest.controller;

import io.github.erlds.domain.entity.Cliente;
import io.github.erlds.domain.repository.Clientes;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

// Gerenciado pelo container de injeção de dependencias do spring
@Controller
public class ClienteController {

    private Clientes clientes;

    public ClienteController (Clientes clientes){
        this.clientes = clientes;
    }

    // Se o nome do parametro for diferente do nome na propriedade, deve-se adicionar esse nome
    // como valor em PathVariable
    @GetMapping("/api/clientes/{id}")
    @ResponseBody
    public ResponseEntity getClienteById(@PathVariable Integer id){
        Optional<Cliente> cliente = clientes.findById(id);

        if(cliente.isPresent()){
            return ResponseEntity.ok(cliente.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/api/clientes")
    @ResponseBody
    public ResponseEntity save ( @RequestBody Cliente cliente){
        Cliente clienteSalvo = clientes.save(cliente);
        return ResponseEntity.ok(clienteSalvo);
    }




}
