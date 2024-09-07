package br.com.fiap.settings.controller;

import br.com.fiap.settings.model.Mail;
import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.model.User;
import br.com.fiap.settings.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/profile")
public class UserController {

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public User getProfile(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User registerProfile(@RequestBody User user) {
        return null;
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfile(@PathVariable Long id) {
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public User updateProfile(@RequestBody User user) {
        return null;
    }
}
