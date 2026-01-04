package com.exercito.taf.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InscricaoRequestDTO {

    @NotNull(message = "ID do evento é obrigatório")
    private UUID eventoId;
}