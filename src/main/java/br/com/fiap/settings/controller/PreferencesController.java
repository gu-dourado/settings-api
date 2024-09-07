package br.com.fiap.settings.controller;

import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/preferences")

public class PreferencesController {

    @GetMapping("/{preferencesId}")
    @ResponseStatus(HttpStatus.OK)
    public Preferences getPreferences(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Preferences registerPreferences(@RequestBody Preferences preferences) {
        return null;
    }

    @DeleteMapping("/{preferencesId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePreferences(@PathVariable Long id) {
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Preferences updatePreferences(@RequestBody Preferences preferences) {
        return null;
    }
}
