package io.github.erlds.service.impl;

import io.github.erlds.domain.repository.Pedidos;
import io.github.erlds.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
