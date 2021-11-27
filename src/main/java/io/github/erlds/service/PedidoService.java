package io.github.erlds.service;


import io.github.erlds.domain.entity.Pedido;
import io.github.erlds.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);
}
