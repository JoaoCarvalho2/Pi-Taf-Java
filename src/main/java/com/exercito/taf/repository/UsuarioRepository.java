package com.exercito.taf.repository;

import com.exercito.taf.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findByIdentidade(String identidade);

    boolean existsByEmail(String email);

    boolean existsByIdentidade(String identidade);
}