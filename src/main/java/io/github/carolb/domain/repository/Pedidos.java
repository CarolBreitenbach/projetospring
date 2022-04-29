package io.github.carolb.domain.repository;

import io.github.carolb.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import io.github.carolb.domain.entity.Pedido;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido,Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
