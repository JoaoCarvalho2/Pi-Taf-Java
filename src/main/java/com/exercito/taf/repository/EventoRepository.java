package com.exercito.taf.repository;

import com.exercito.taf.entity.Evento;
import com.exercito.taf.enums.StatusEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface EventoRepository extends JpaRepository<Evento, UUID> {

    List<Evento> findByStatus(StatusEvento status);

    List<Evento> findByDataBetween(LocalDate inicio, LocalDate fim);

    List<Evento> findByDataAfterAndStatus(LocalDate data, StatusEvento status);

    List<Evento> findByCriadoPorId(UUID usuarioId);
}