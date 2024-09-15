package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Preferences;

public record PreferencesUpdateResponse(
        Long categoriesId,
        String theme
) {
  public PreferencesUpdateResponse(Preferences preferences) {
    this(preferences.getCategories().getId(), preferences.getTheme());
  }
}
