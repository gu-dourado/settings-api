package br.com.fiap.settings.dto;

import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Mail;
import br.com.fiap.settings.model.User;

public record MailResponse (
        String senderName,
        Long categoriesId,
        String title,
        String body
) {
  public MailResponse(Mail mail) {
    this(mail.getSender().getName(), mail.getCategories().getId(), mail.getTitle(), mail.getBody());
  }
}
