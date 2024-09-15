package br.com.fiap.settings.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(
        @NotBlank(message = "Preencha o campo Nome.")
        String name,
        @NotBlank(message = "Preencha o campo Email.")
        @Email
        String mailAddress,
        @NotBlank(message = "Digite a sua senha.")
        @Size
        String password,
        @NotBlank
        PreferencesRequest preferences
) {
}
