package io.github.erlds.service;


import io.github.erlds.domain.entity.Pedido;
import io.github.erlds.domain.enums.StatusPedido;
import io.github.erlds.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
