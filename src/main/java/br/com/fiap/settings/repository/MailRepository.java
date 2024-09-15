package br.com.fiap.settings.repository;

import br.com.fiap.settings.dto.MailResponse;
import br.com.fiap.settings.model.Mail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MailRepository extends JpaRepository<Mail, Long> {
  Page<MailResponse> findAllByReceiverId(Pageable pageable, Long receiverId);
}
