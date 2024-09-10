package br.com.fiap.settings.service;

import br.com.fiap.settings.dto.MailRequest;
import br.com.fiap.settings.dto.MailResponse;
import br.com.fiap.settings.model.Mail;
import br.com.fiap.settings.model.User;
import br.com.fiap.settings.repository.MailRepository;
import br.com.fiap.settings.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {

  @Autowired
  private MailRepository mailRepository;

  @Autowired
  private UserService userService;

  public MailResponse save(MailRequest mailRequest, Long receiverId, Long senderId) {
    User receiver = userService.findById(receiverId);
    User sender = userService.findById(senderId);

    Mail mailToSave = convertToMail(mailRequest);
    mailToSave.setReceiver(receiver);
    mailToSave.setSender(sender);

    Mail savedMail = mailRepository.save(mailToSave);

    return new MailResponse(savedMail);
  }

  public void delete(Long mailId) {
    mailRepository.deleteById(mailId);
  }

  private Mail convertToMail(MailRequest mailRequest) {
    Mail mail = new Mail();
    BeanUtils.copyProperties(mailRequest, mail);

    return mail;
  }
}
