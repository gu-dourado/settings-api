package br.com.fiap.settings.repository;

import br.com.fiap.settings.dto.UserResponse;
import br.com.fiap.settings.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByMailAddress(String mailAddress);
}