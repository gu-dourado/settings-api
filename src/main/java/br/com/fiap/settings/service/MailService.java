package br.com.fiap.settings.service;

import br.com.fiap.settings.dto.MailRequest;
import br.com.fiap.settings.dto.MailResponse;
import br.com.fiap.settings.model.Mail;
import br.com.fiap.settings.model.User;
import br.com.fiap.settings.repository.MailRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MailService {

  @Autowired
  private MailRepository mailRepository;

  public MailResponse save(MailRequest mailRequest, User receiver, User sender) {
    Mail mailToSave = convertToMail(mailRequest);
    mailToSave.setReceiver(receiver);
    mailToSave.setSender(sender);

    Mail savedMail = mailRepository.save(mailToSave);

    return new MailResponse(savedMail);
  }

  public void delete(Long mailId) {
    mailRepository.deleteById(mailId);
  }

  public MailResponse findById(Long mailId) {
    return convertToMailResponse(mailRepository.findById(mailId).orElseThrow(() -> new RuntimeException("Mail não encontrado.")));
  }

  private Mail convertToMail(MailRequest mailRequest) {
    Mail mail = new Mail();
    BeanUtils.copyProperties(mailRequest, mail);

    return mail;
  }

  private MailResponse convertToMailResponse(Mail mail) {
    return new MailResponse(mail.getSender(), mail.getCategories(), mail.getTitle(), mail.getBody());
  }
}
