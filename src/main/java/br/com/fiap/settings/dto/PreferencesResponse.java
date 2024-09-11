package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.model.User;

public record PreferencesResponse(
        Long id,
        User user,
        Categories categories,
        String theme
) {
  public PreferencesResponse(Preferences preferences) {
    this(preferences.getId(), preferences.getUser(), preferences.getCategories(), preferences.getTheme());
  }
}
