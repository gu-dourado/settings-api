package br.com.fiap.settings.dto;

public record PreferencesResponse(
        String user,
        String category,
        String theme
) {
}
