package br.com.fiap.settings.dto;

public record UserRequest(
        Long id,
        String name,
        String mailAdress,
        String password,
        String preferences
) {
}
