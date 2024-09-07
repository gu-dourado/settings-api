package br.com.fiap.settings.controller;

import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("")

public class PreferencesController {

    @GetMapping("/preferences/{preferencesId}")
    @ResponseStatus(HttpStatus.OK)
    public Preferences getPreferences(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/preferences")
    @ResponseStatus(HttpStatus.CREATED)
    public Preferences registerPreferences(@RequestBody Preferences preferences) {
        return null;
    }

    @DeleteMapping("/preferences/{preferencesId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePreferences(@PathVariable Long id) {
    }

    @PutMapping("/preferences")
    @ResponseStatus(HttpStatus.OK)
    public User updatePreferences(@RequestBody Preferences preferences) {
        return null;
    }
}
