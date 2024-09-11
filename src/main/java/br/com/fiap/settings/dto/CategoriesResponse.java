package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.User;

public record CategoriesResponse(
        Boolean allCategories,
        Boolean education,
        Boolean family,
        Boolean important,
        Boolean advertising,
        Boolean social
) {
  public CategoriesResponse(Categories categories) {
    this(categories.getAllCategories(), categories.getEducation(), categories.getFamily(), categories.getImportant(), categories.getAdvertising(), categories.getSocial());
  }
}
