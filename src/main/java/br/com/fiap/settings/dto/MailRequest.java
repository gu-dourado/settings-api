package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;

public record MailRequest(
        Categories categories,
        String title,
        String body
) {
}
