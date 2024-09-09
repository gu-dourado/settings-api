package br.com.fiap.settings.dto;

public record CategoriesResponse(
        Boolean all,
        Boolean education,
        Boolean family,
        Boolean important,
        Boolean advertising,
        Boolean social
) {
}
