package com.exercito.taf.dto.request;

import com.exercito.taf.enums.LinhaEnsino;
import com.exercito.taf.enums.Role;
import com.exercito.taf.enums.Sexo;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioRequestDTO {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Nome de guerra é obrigatório")
    private String nomeGuerra;

    @NotBlank(message = "Identidade é obrigatória")
    private String identidade;

    @NotBlank(message = "Posto/Graduação é obrigatório")
    private String postoGraduacao;

    @NotNull(message = "Idade é obrigatória")
    @Min(value = 18, message = "Idade mínima é 18 anos")
    @Max(value = 70, message = "Idade máxima é 70 anos")
    private Integer idade;

    @NotNull(message = "Sexo é obrigatório")
    private Sexo sexo;

    @NotNull(message = "Linha de ensino é obrigatória")
    private LinhaEnsino linhaEnsino;

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email inválido")
    private String email;

    @NotBlank(message = "Senha é obrigatória")
    @Size(min = 6, message = "Senha deve ter no mínimo 6 caracteres")
    private String senha;

    private Role role;

    private String turma;
}