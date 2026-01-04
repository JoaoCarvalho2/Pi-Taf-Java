package com.exercito.taf.entity;

import com.exercito.taf.enums.Conceito;
import com.exercito.taf.enums.TipoProva;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "resultados")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inscricao_id", nullable = false)
    private Inscricao inscricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_prova", nullable = false)
    private TipoProva tipoProva;

    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private Integer pontuacao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Conceito conceito;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}