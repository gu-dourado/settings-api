package br.com.fiap.settings.dto;

public record CategoryRequest(
        Long id,
        Boolean all,
        Boolean education,
        Boolean family,
        Boolean important,
        Boolean advertising,
        Boolean social
) {
}
