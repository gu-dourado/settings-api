package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Mail;
import br.com.fiap.settings.model.User;

public record MailResponse (
        User sender,
        Categories categories,
        String title,
        String body
) {
  public MailResponse(Mail mail) {
    this(mail.getSender(), mail.getCategories(), mail.getTitle(), mail.getBody());
  }
}
