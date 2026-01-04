package com.exercito.taf.dto.response;

import com.exercito.taf.enums.TipoProva;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultadoResponseDTO {
    private UUID id;
    private UUID inscricaoId;
    private TipoProva tipoProva;
    private Double resultado;
    private LocalDateTime createdAt;
}
