package com.exercito.taf.repository;

import com.exercito.taf.entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, UUID> {

    List<Inscricao> findByEventoId(UUID eventoId);

    List<Inscricao> findByUsuarioId(UUID usuarioId);

    Optional<Inscricao> findByUsuarioIdAndEventoId(UUID usuarioId, UUID eventoId);

    boolean existsByUsuarioIdAndEventoId(UUID usuarioId, UUID eventoId);

    List<Inscricao> findByEventoIdAndPresenteTrue(UUID eventoId);
}