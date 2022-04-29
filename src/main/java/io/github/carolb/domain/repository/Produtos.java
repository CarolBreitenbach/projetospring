package io.github.carolb.domain.repository;
import io.github.carolb.domain.entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
