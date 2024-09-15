package br.com.fiap.settings.dto;

public record UserRequest(
        String name,
        String mailAddress,
        String password,
        PreferencesRequest preferences
) {
}
