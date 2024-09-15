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
    private CategoriesService categoriesService;

    @Autowired
    private MailService mailService;

    @Autowired
    private PreferencesService preferencesService;

    @Autowired
    private UserRepository userRepository;

    public UserRegisterResponse save(UserRequest userRequest, Long preferencesId) {
        User userToSave = convertUserRequestToUser(userRequest);

//   TA AQUI     PreferencesResponse savedPreferences = preferencesService.findById(preferencesId);
//
//        userToSave.setPreferences(preferencesService.convertPreferencesResponseToPreferences(savedPreferences));

        User savedUser = userRepository.save(userToSave);

        return new UserRegisterResponse(savedUser);
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }

    public UserResponse update(UserRequest userRequest, Long id, Long preferencesId) {
        findById(id);

        User userToUpdate = convertUserRequestToUser(userRequest);

        PreferencesResponse savedPreferences = preferencesService.findById(preferencesId);

        userToUpdate.setId(id);
        userToUpdate.setPreferences(preferencesService.convertPreferencesRequestToPreferences(userRequest.preferences()));
        userToUpdate.getPreferences().setId(preferencesId);
        userToUpdate.getPreferences().setCategories(categoriesService.convertCategoriesRequestToCategories(userRequest.preferences().categories()));
        userToUpdate.getPreferences().getCategories().setId(savedPreferences.categoriesId());

        User updatedUser = userRepository.save(userToUpdate);

        return new UserResponse(updatedUser);
    }

    public MailResponse saveMail(MailRequest mailRequest, Long senderId) {
        Mail mailToSave = mailService.convertMailRequestToMail(mailRequest);

        UserResponse receiver = findByMailAddress(mailRequest.receiver());
        UserResponse sender = findById(senderId);
        mailToSave.setReceiver(convertUserResponseToUser(receiver));
        mailToSave.setSender(convertUserResponseToUser(sender));
        mailToSave.setCategories(categoriesService.convertCategoriesRequestToCategories(mailRequest.categories()));

        return mailService.save(mailToSave);
    }

    public UserResponse findById(Long id) {
      return new UserResponse(userRepository.findById(id).orElseThrow(() -> new RuntimeException("Pessoa não encontrada.")));
    }

    public UserResponse findByMailAddress(String mailAddress) {
        return new UserResponse(userRepository.findByMailAddress(mailAddress));
    }

    public User convertUserRequestToUser(UserRequest userRequest) {
        User user = new User();
        BeanUtils.copyProperties(userRequest, user);

        return user;
    }

    public User convertUserResponseToUser(UserResponse userResponse) {
        User user = new User();
        BeanUtils.copyProperties(userResponse, user);

        return user;
    }
}

