package com.exercito.taf.repository;

import com.exercito.taf.entity.Resultado;
import com.exercito.taf.enums.TipoProva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ResultadoRepository extends JpaRepository<Resultado, UUID> {

    List<Resultado> findByInscricaoId(UUID inscricaoId);

    Optional<Resultado> findByInscricaoIdAndTipoProva(UUID inscricaoId, TipoProva tipoProva);

    boolean existsByInscricaoIdAndTipoProva(UUID inscricaoId, TipoProva tipoProva);
}