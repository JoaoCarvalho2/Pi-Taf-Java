package com.exercito.taf.dto.response;

import com.exercito.taf.enums.LinhaEnsino;
import com.exercito.taf.enums.Role;
import com.exercito.taf.enums.Sexo;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioResponseDTO {

    private UUID id;
    private String nome;
    private String nomeGuerra;
    private String identidade;
    private String postoGraduacao;
    private Integer idade;
    private Sexo sexo;
    private LinhaEnsino linhaEnsino;
    private String email;
    private Role role;
    private Boolean ativo;
    private String turma;
    private LocalDateTime createdAt;
}