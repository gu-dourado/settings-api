package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Preferences;

public record PreferencesRequest(
        CategoriesRequest categories,
        String theme
) {
}
