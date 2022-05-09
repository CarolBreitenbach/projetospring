package io.github.carolb.domain.repository;
import io.github.carolb.domain.entity.Cliente;
import io.github.carolb.domain.entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Produtos extends JpaRepository<Produto,Integer> {




}
