package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Preferences;
import jakarta.validation.constraints.Email;

public record CategoriesRequest(
        Long id,
        Boolean allCategories,
        Boolean education,
        Boolean family,
        Boolean important,
        Boolean advertising,
        Boolean social
) {
}
