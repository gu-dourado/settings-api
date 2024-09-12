package br.com.fiap.settings.controller;

import br.com.fiap.settings.dto.CategoriesResponse;
import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.service.CategoriesService;
import br.com.fiap.settings.service.PreferencesService;
import br.com.fiap.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/categories")

public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public Categories getCategory(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable Long id) {
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoriesResponse updateCategory(@RequestBody Categories category) {
        return null;
    }
}
