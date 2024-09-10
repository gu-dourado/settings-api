package br.com.fiap.settings.service;

import br.com.fiap.settings.model.User;
import br.com.fiap.settings.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fiap.settings.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Pessoa não encontrada."));
    }
}

