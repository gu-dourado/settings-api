package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record MailRequest(
        @NotBlank(message = "Adicione pelo menos um destinatário.")
        @Email
        String receiver,
        @NotBlank
        CategoriesRequest categories,
        String title,
        String body
) {
}
