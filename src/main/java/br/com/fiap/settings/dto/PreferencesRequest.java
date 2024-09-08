package br.com.fiap.settings.dto;

public record PreferencesRequest(
        Long id,
        String user,
        String category,
        String theme
) {
}
