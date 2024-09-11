package br.com.fiap.settings.service;

import br.com.fiap.settings.dto.*;
import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Mail;
import br.com.fiap.settings.model.Preferences;
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
    private PreferencesService preferencesService;

    @Autowired
    private UserRepository userRepository;

    public UserResponse save(UserRequest userRequest) {
        User userToSave = convertToUser(userRequest);

        PreferencesResponse savedPreferences = preferencesService.save(userRequest.preferences());

        userToSave.setPreferences(preferencesService.convertPreferencesResponseToPreferences(savedPreferences));

        User savedUser = userRepository.save(userToSave);

        return new UserResponse(savedUser);
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }

    public UserResponse update(UserRequest userRequest) {
        userRepository.findById(userRequest.id()).orElseThrow(() -> new RuntimeException("Pessoa não encontrada."));

        User userToUpdate = convertToUser(userRequest);
        User updatedUser = userRepository.save(userToUpdate);

        return new UserResponse(updatedUser);
    }

    public UserResponse findById(Long id) {
      return new UserResponse(userRepository.findById(id).orElseThrow(() -> new RuntimeException("Pessoa não encontrada.")));
    }

    private User convertToUser(UserRequest userRequest) {
        User user = new User();
        BeanUtils.copyProperties(userRequest, user);

        return user;
    }
}

