package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.User;

public record UserResponse(
        Long id,
        String name,
        String mailAdress
) {
  public UserResponse(User user) {
    this(user.getId(), user.getName(), user.getMailAddress());
  }
}
