package br.com.fiap.settings.service;

import br.com.fiap.settings.dto.*;
import br.com.fiap.settings.model.Categories;
import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.model.User;
import br.com.fiap.settings.repository.CategoriesRepository;
import br.com.fiap.settings.repository.PreferencesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferencesService {

  @Autowired
  private PreferencesRepository preferencesRepository;

  @Autowired
  private CategoriesService categoriesService;

  public PreferencesResponse save(PreferencesRequest preferencesRequest) {
    Preferences preferencesToSave = convertPreferencesRequestToPreferences(preferencesRequest);

    CategoriesResponse savedCategories = categoriesService.save(preferencesRequest.categories());

    preferencesToSave.setCategories(categoriesService.convertCategoriesResponseToCategories(savedCategories));

    Preferences savedPreferences = preferencesRepository.save(preferencesToSave);

    return new PreferencesResponse(savedPreferences);
  }

  public void delete(Long preferencesId) {
    preferencesRepository.deleteById(preferencesId);
  }

  public PreferencesResponse update(PreferencesRequest preferencesRequest) {
    preferencesRepository.findById(preferencesRequest.id()).orElseThrow(() -> new RuntimeException("Preferências não encontradas."));

    Preferences preferencesToUpdate = convertPreferencesRequestToPreferences(preferencesRequest);
    Preferences updatedPreferences = preferencesRepository.save(preferencesToUpdate);

    return new PreferencesResponse(updatedPreferences);
  }

  public PreferencesResponse findById(Long id) {
    return new PreferencesResponse(preferencesRepository.findById(id).orElseThrow(() -> new RuntimeException("Preferências não encontradas.")));
  }

  private Preferences convertPreferencesRequestToPreferences(PreferencesRequest preferencesRequest) {
    Preferences preferences = new Preferences();
    BeanUtils.copyProperties(preferencesRequest, preferences);

    return preferences;
  }

  public Preferences convertPreferencesResponseToPreferences(PreferencesResponse preferencesResponse) {
    Preferences preferences = new Preferences();
    BeanUtils.copyProperties(preferencesResponse, preferences);

    return preferences;
  }
}
