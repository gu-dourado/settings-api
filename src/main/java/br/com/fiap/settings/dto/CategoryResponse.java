package br.com.fiap.settings.dto;

public record CategoryResponse(
        Boolean all,
        Boolean education,
        Boolean family,
        Boolean important,
        Boolean advertising,
        Boolean social
) {
}
