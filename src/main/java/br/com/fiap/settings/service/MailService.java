package br.com.fiap.settings.service;

import br.com.fiap.settings.model.Mail;
import br.com.fiap.settings.repository.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {

  @Autowired
  private MailRepository mailRepository;

  public Mail save(Mail mail) {
    return mailRepository.save(mail);
  }

  public void delete(Long mailId) {
    mailRepository.deleteById(mailId);
  }
}
