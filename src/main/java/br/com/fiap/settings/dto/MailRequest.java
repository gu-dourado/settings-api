package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;

public record MailRequest(
        String receiver,
        CategoriesRequest categories,
        String title,
        String body
) {
}
