package com.exercito.taf.dto.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InscricaoResponseDTO {
    private UUID id;
    private UUID eventoId;
    private String eventoNome;
    private UUID usuarioId;
    private String usuarioNome;
    private Boolean presente;
    private LocalDateTime createdAt;
}
