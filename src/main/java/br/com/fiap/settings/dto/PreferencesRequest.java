package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;

public record PreferencesRequest(
        Long id,
        CategoriesRequest categories,
        String theme
) {
}
