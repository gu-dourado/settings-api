package br.com.fiap.settings.service;

import br.com.fiap.settings.dto.CategoriesRequest;
import br.com.fiap.settings.dto.CategoriesResponse;
import br.com.fiap.settings.dto.PreferencesRequest;
import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.repository.CategoriesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriesService {

  @Autowired
  private CategoriesRepository categoriesRepository;

  public CategoriesResponse save(CategoriesRequest categoriesRequest) {
    Categories categoriesToSave = convertCategoriesRequestToCategories(categoriesRequest);
    Categories categoriesSaved = categoriesRepository.save(categoriesToSave);

    return new CategoriesResponse(categoriesSaved);
  }

  public void delete(Long categoryId) {
    categoriesRepository.deleteById(categoryId);
  }

  public CategoriesResponse findById(Long id) {
    return new CategoriesResponse(categoriesRepository.findById(id).orElseThrow(() -> new RuntimeException("Categorias não encontradas.")));
  }

  public Categories convertCategoriesRequestToCategories(CategoriesRequest categoriesRequest) {
    Categories categories = new Categories();
    BeanUtils.copyProperties(categoriesRequest, categories);

    return categories;
  }

  public Categories convertCategoriesResponseToCategories(CategoriesResponse categoriesResponse) {
    Categories categories = new Categories();
    BeanUtils.copyProperties(categoriesResponse, categories);

    return categories;
  }
}
