package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.model.User;

public record UserResponse(
        Long id,
        String name,
        String mailAddress,
        Long preferencesId
) {
  public UserResponse(User user) {
    this(user.getId(), user.getName(), user.getMailAddress(), user.getPreferences().getId());
  }
}
