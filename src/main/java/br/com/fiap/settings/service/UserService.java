package br.com.fiap.settings.service;

import br.com.fiap.settings.dto.MailResponse;
import br.com.fiap.settings.dto.UserRequest;
import br.com.fiap.settings.dto.UserResponse;
import br.com.fiap.settings.model.Mail;
import br.com.fiap.settings.model.User;
import br.com.fiap.settings.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private MailService mailService;

    @Autowired
    private UserRepository userRepository;

    public UserResponse save(UserRequest userRequest) {
        User userToSave = convertToUser(userRequest);
        User savedUser = userRepository.save(userToSave);

        return new UserResponse(savedUser);
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }

    public UserResponse update(User user) {
        User targetUser = findById(user.getId());
        User updatedUser = userRepository.save(targetUser);

        return new UserResponse(updatedUser);
    }

    public User findById(Long id) {
      return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Pessoa não encontrada."));
    }

    private User convertToUser(UserRequest userRequest) {
        User user = new User();
        BeanUtils.copyProperties(userRequest, user);

        return user;
    }
}

