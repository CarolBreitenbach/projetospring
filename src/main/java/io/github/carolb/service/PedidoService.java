package io.github.carolb.service;

import io.github.carolb.domain.entity.Pedido;
import io.github.carolb.domain.enums.StatusPedido;
import io.github.carolb.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

    Optional <Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);


}
