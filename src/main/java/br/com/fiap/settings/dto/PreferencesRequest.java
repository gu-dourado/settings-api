package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Preferences;

public record PreferencesRequest(
        Long id,
        CategoriesRequest categories,
        String theme
) {
}
