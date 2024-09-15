package br.com.fiap.settings.dto;

public record PreferencesUpdateRequest(
        Long id,
        CategoriesRequest categories,
        String theme
) {
}
