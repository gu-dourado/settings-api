package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Preferences;
import jakarta.validation.constraints.NotBlank;

public record PreferencesRequest(
        @NotBlank(message = "Escolha uma Preferencia.")
        CategoriesRequest categories,
        @NotBlank
        String theme
) {
}
