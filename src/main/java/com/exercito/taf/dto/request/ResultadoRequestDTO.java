package com.exercito.taf.dto.request;

import com.exercito.taf.enums.TipoProva;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultadoRequestDTO {

    @NotNull(message = "ID da inscrição é obrigatório")
    private UUID inscricaoId;

    @NotNull(message = "Tipo da prova é obrigatório")
    private TipoProva tipoProva;

    @NotNull(message = "Resultado é obrigatório")
    private Double resultado;
}