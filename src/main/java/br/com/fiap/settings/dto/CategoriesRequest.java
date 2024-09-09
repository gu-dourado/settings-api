package br.com.fiap.settings.dto;

public record CategoriesRequest(
        Long id,
        Boolean all,
        Boolean education,
        Boolean family,
        Boolean important,
        Boolean advertising,
        Boolean social
) {
}
