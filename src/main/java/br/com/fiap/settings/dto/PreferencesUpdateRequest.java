package br.com.fiap.settings.dto;

import jakarta.validation.constraints.NotBlank;

public record PreferencesUpdateRequest(
        @NotBlank
        Long id,
        @NotBlank(message = "Escolha uma Categoria.")
        CategoriesRequest categories,
        @NotBlank
        String theme
) {
}
