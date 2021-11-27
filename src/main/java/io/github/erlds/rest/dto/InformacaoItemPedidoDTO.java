package io.github.erlds.rest.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class InformacaoItemPedidoDTO {
    private String descricaoProduto;
    private BigDecimal precoUnitario;
    private Integer quantidade;
}
