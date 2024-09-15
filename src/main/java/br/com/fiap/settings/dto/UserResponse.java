package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.model.User;

public record UserResponse(
        String name,
        String mailAddress
) {
  public UserResponse(User user) {
    this(user.getName(), user.getMailAddress());
  }
}
