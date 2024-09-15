package br.com.fiap.settings.controller;

import br.com.fiap.settings.dto.PreferencesRequest;
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
    public PreferencesResponse getPreferences(@RequestHeader("Preferences-Id") Long userId) {
        return preferencesService.findById(userId);
    }

//    @PutMapping
//    @ResponseStatus(HttpStatus.OK)
//    public PreferencesResponse updatePreferences(@RequestBody PreferencesRequest preferencesRequest) {
//        return preferencesService.update(preferencesRequest);
//    }
}
