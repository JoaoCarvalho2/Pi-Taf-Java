package com.exercito.taf.dto.request;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventoRequestDTO {

    @NotBlank(message = "Nome do evento é obrigatório")
    private String nome;

    @NotNull(message = "Data do evento é obrigatória")
    @Future(message = "Data do evento deve ser futura")
    private LocalDate data;

    @NotBlank(message = "Local do evento é obrigatório")
    private String local;
}