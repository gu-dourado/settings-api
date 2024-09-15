package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.model.User;

public record PreferencesResponse(
        Long preferenceId,
        Long categoriesId,
        String theme
) {
  public PreferencesResponse(Preferences preferences) {
    this(preferences.getId(), preferences.getCategories().getId(), preferences.getTheme());
  }
}
