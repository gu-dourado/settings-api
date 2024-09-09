package br.com.fiap.settings.controller;

import br.com.fiap.settings.model.Categories;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/category")

public class CategoriesController {

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public Categories getCategory(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categories registerCategory(@RequestBody Categories category) {
        return null;
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable Long id) {
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Categories updateCategory(@RequestBody Categories category) {
        return null;
    }
}
