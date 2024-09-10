package br.com.fiap.settings.service;

import br.com.fiap.settings.dto.MailResponse;
import br.com.fiap.settings.model.User;
import br.com.fiap.settings.repository.UserRepository;
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

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        User targetUser = findById(user.getId());
        return userRepository.save(targetUser);
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Pessoa não encontrada."));
    }

//    public Page<MailResponse> findAllMails(Pageable pageable, Long userId) {
//        return mailService.findAllByUserId(pageable, userId);
//    }
}

