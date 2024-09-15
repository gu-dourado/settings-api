package br.com.fiap.settings.controller;

import br.com.fiap.settings.dto.CategoriesRequest;
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

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoriesResponse getCategory(@RequestHeader("Categories-Id") Long categoriesId) {
        return categoriesService.findById(categoriesId);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoriesResponse updateCategory(@RequestBody CategoriesRequest categoriesRequest) {
        return categoriesService.update(categoriesRequest);
    }
}
