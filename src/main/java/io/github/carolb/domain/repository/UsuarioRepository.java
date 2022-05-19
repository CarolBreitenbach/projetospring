package io.github.carolb.domain.repository;

import io.github.carolb.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {


    Optional<Usuario> findByLogin(String login);
}
