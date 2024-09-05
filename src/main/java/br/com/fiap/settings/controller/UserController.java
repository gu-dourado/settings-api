package br.com.fiap.settings.controller;

import br.com.fiap.settings.model.Mail;
import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("")
public class UserController {

    @GetMapping("/{userId}/profile")
    @ResponseStatus(HttpStatus.OK)
    public User getProfile(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/{userId}/preferences")
    @ResponseStatus(HttpStatus.OK)
    public Preferences getPreferences(@PathVariable Long id) {
        return null;
    }

    // oi
    @GetMapping("/{userId}/mails")
    @ResponseStatus(HttpStatus.OK)
    public List<Mail> getMails(@PathVariable Long id) {
        return null;
    }
}
