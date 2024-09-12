package br.com.fiap.settings.controller;

import br.com.fiap.settings.dto.PreferencesResponse;
import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.model.User;
import br.com.fiap.settings.service.PreferencesService;
import br.com.fiap.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/preferences")

public class PreferencesController {

    @Autowired
    private PreferencesService preferencesService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Preferences getPreferences(@PathVariable Long id) {
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
