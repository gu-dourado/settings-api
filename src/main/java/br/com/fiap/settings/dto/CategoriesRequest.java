package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Preferences;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CategoriesRequest(
        @NotBlank
        Long id,
        @NotBlank
        Boolean allCategories,
        @NotBlank
        Boolean education,
        @NotBlank
        Boolean family,
        @NotBlank
        Boolean important,
        @NotBlank
        Boolean advertising,
        @NotBlank
        Boolean social
) {
}
