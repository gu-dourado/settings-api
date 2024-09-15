package br.com.fiap.settings.controller;

import br.com.fiap.settings.dto.MailRequest;
import br.com.fiap.settings.dto.MailResponse;
import br.com.fiap.settings.dto.UserRequest;
import br.com.fiap.settings.dto.UserResponse;
import br.com.fiap.settings.model.Mail;
import br.com.fiap.settings.service.MailService;
import br.com.fiap.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/mail")

public class MailController {

    @Autowired
    private MailService mailService;

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<MailResponse> getAllReceivedMails(@PageableDefault(size = 5, page = 0) Pageable pageable, @RequestHeader("User-Id") Long receiverId) {
        return mailService.findAllByReceiverId(pageable, receiverId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MailResponse registerProfile(@RequestBody MailRequest mailRequest, @RequestHeader("User-Id") Long senderId) {
        return userService.saveMail(mailRequest, senderId);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Mail updateMail(@RequestBody Mail mail) {
        return null;
    }
}
