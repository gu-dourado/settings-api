package br.com.fiap.settings.service;

import br.com.fiap.settings.model.User;
import br.com.fiap.settings.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public User findById(Long id) {
    return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Pessoa não encontrada."));
  }
}
