package br.com.fiap.settings.controller;

import br.com.fiap.settings.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("")

public class CategoryController {

    @GetMapping("/category/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public Category getCategory(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/category")
    @ResponseStatus(HttpStatus.CREATED)
    public Category registerCategory(@RequestBody Category category) {
        return null;
    }

    @DeleteMapping("/category/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable Long id) {
    }

    @PutMapping("/category")
    @ResponseStatus(HttpStatus.OK)
    public Category updateCategory(@RequestBody Category category) {
        return null;
    }
}
