package br.com.fiap.settings.service;

import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriesService {

  @Autowired
  private CategoriesRepository categoriesRepository;

  public Categories save(Categories category) {
    return categoriesRepository.save(category);
  }

  public void delete(Long categoryId) {
    categoriesRepository.deleteById(categoryId);
  }
}
