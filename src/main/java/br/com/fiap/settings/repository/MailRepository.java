package br.com.fiap.settings.repository;

import br.com.fiap.settings.model.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<Mail, Long> {

}
