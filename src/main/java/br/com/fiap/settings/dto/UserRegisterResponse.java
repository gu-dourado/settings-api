package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.User;

public record UserRegisterResponse(
        Long id,
        String name,
        String mailAddress,
        Long preferencesId
) {
  public UserRegisterResponse(User user) {
    this(user.getId(), user.getName(), user.getMailAddress(), user.getPreferences().getId());
  }
}
