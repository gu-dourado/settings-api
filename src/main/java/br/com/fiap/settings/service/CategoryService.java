package br.com.fiap.settings.service;

import br.com.fiap.settings.model.Category;
import br.com.fiap.settings.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

  @Autowired
  private CategoryRepository categoryRepository;

  public Category save(Category category) {
    return categoryRepository.save(category);
  }

  public void delete(Long categoryId) {
    categoryRepository.deleteById(categoryId);
  }
}
