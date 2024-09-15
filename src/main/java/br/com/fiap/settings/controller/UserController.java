package br.com.fiap.settings.controller;

import br.com.fiap.settings.dto.*;
import br.com.fiap.settings.model.Mail;
import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.model.User;
import br.com.fiap.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/profile")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public UserResponse getProfile(@RequestHeader("User-Id") Long userId) {
        return userService.findById(userId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserRegisterResponse registerProfile(@RequestBody UserRequest userRequest) {
        return userService.save(userRequest);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfile(@RequestHeader("User-Id") Long userId) {
        userService.delete(userId);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UserResponse updateProfile(@RequestBody UserRequest userRequest, @RequestHeader("User-Id") Long userId, @RequestHeader("Preferences-Id") Long preferencesId) {
        return userService.update(userRequest, userId, preferencesId);
    }
}
