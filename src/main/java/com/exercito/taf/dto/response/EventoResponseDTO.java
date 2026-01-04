package com.exercito.taf.dto.response;

import com.exercito.taf.enums.StatusEvento;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventoResponseDTO {

    private UUID id;
    private String nome;
    private LocalDate data;
    private String local;
    private StatusEvento status;
    private UUID criadoPorId;
    private String criadoPorNome;
    private LocalDateTime createdAt;
    private Integer totalInscritos;
}